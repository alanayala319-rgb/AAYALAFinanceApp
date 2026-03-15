package com.example.libraryapp.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.libraryapp.FinanceColors
import com.example.libraryapp.Transaction

@Composable
fun TransactionsSectionHeader(onSeeAllClick: () -> Unit) {
    Row(
        modifier              = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 10.dp),
        verticalAlignment     = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text  = "Transactions",
            style = MaterialTheme.typography.titleLarge.copy(
                fontWeight = FontWeight.Bold,
                color      = FinanceColors.TextPrimary,
                fontSize   = 22.sp
            )
        )
        TextButton(
            onClick        = onSeeAllClick,
            contentPadding = PaddingValues(0.dp)
        ) {
            Text(
                text  = "See All",
                style = MaterialTheme.typography.bodyMedium.copy(
                    color    = FinanceColors.TextSecondary,
                    fontSize = 14.sp
                )
            )
        }
    }
}
//
@Composable
fun TransactionItem(transaction: Transaction) {
    val rawFormatted = if (transaction.amount < 0) {
        val abs = -transaction.amount
        val s   = if (abs % 1.0 == 0.0) "${abs.toInt()}.0"
        else abs.toBigDecimal().stripTrailingZeros().toPlainString()
        "$-${s}"
    } else {
        val s = if (transaction.amount % 1.0 == 0.0) "${transaction.amount.toInt()}.0"
        else transaction.amount.toBigDecimal().stripTrailingZeros().toPlainString()
        "$${s}"
    }

    Row(
        modifier          = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 14.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier         = Modifier
                .size(50.dp)
                .clip(CircleShape)
                .background(FinanceColors.IconBg),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector        = transaction.icon,
                contentDescription = null,
                tint               = Color.White,
                modifier           = Modifier.size(26.dp)
            )
        }

        Spacer(Modifier.width(14.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(
                text  = transaction.name,
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.SemiBold,
                    color      = FinanceColors.TextPrimary,
                    fontSize   = 15.sp
                )
            )
            Spacer(Modifier.height(3.dp))
            Text(
                text  = transaction.category,
                style = MaterialTheme.typography.bodySmall.copy(
                    color    = FinanceColors.TextSecondary,
                    fontSize = 13.sp
                )
            )
        }

        Column(horizontalAlignment = Alignment.End) {
            Text(
                text  = rawFormatted,
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.SemiBold,
                    color      = FinanceColors.TextPrimary,
                    fontSize   = 15.sp
                )
            )
            Spacer(Modifier.height(3.dp))
            Text(
                text  = transaction.time,
                style = MaterialTheme.typography.bodySmall.copy(
                    color    = FinanceColors.TextSecondary,
                    fontSize = 13.sp
                )
            )
        }
    }
}
