package com.example.libraryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.libraryapp.componentes.HomeHeader
import com.example.libraryapp.componentes.SummarySection
import com.example.libraryapp.componentes.TransactionItem
import com.example.libraryapp.componentes.TransactionsSectionHeader
import com.example.libraryapp.ui.theme.LibraryAppTheme
//as
val sampleUser = User(name = "Alan", balance = 0.0)

val sampleTransactions = listOf(
    Transaction("Supermarket",        "Groceries",      45.99,  "10:30 AM", Icons.Default.ShoppingCart),
    Transaction("Gas Station",        "Fuel",          -30.50,  "12:15 PM", Icons.Default.ShoppingCart),
    Transaction("Coffee Shop",        "Food & Drinks",   5.75,  "8:00 AM",  Icons.Default.ShoppingCart),
    Transaction("Electronics Store",  "Electronics",   120.00,  "3:45 PM",  Icons.Default.ShoppingCart),
    Transaction("Bookstore",          "Books",          25.99,  "2:00 PM",  Icons.Default.ShoppingCart),
    Transaction("Restaurant",         "Dining",         60.00,  "7:30 PM",  Icons.Default.ShoppingCart)
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LibraryAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        HomeScreen()
                    }
                }
            }
        }
    }
}

@Composable
fun HomeScreen(
    user: User = sampleUser,
    transactions: List<Transaction> = sampleTransactions
) {
    LazyColumn(
        modifier       = Modifier
            .fillMaxSize()
            .background(FinanceColors.Background),
        contentPadding = PaddingValues(bottom = 32.dp)
    ) {
        item { HomeHeader(user = user) }

        item {
            Spacer(Modifier.height(8.dp))
            SummarySection()
            Spacer(Modifier.height(20.dp))
        }

        item { TransactionsSectionHeader(onSeeAllClick = {}) }

        items(transactions) { tx ->
            TransactionItem(transaction = tx)
            HorizontalDivider(
                color     = FinanceColors.Divider,
                thickness = 1.dp,
                modifier  = Modifier.padding(horizontal = 20.dp)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    LibraryAppTheme {
        HomeScreen()
    }
}
