package com.example.libraryapp.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.libraryapp.FinanceColors
import com.example.libraryapp.User

@Composable
fun HomeHeader(user: User) {
    Row(
        modifier              = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 20.dp),
        verticalAlignment     = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier         = Modifier
                    .size(52.dp)
                    .clip(CircleShape)
                    .background(FinanceColors.AvatarBg),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector        = Icons.Default.Person,
                    contentDescription = "Avatar",
                    tint               = Color(0xFF4A4A4A),
                    modifier           = Modifier.size(30.dp)
                )
            }

            Spacer(Modifier.width(12.dp))

            Column {
                Text(
                    text  = "Hola ${user.name}",
                    style = MaterialTheme.typography.headlineSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color      = FinanceColors.TextPrimary,
                        fontSize   = 26.sp
                    )
                )
                Text(
                    text  = "Bienvenido",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color    = FinanceColors.TextSecondary,
                        fontSize = 14.sp
                    )
                )
            }
        }

        Icon(
            imageVector        = Icons.Default.Menu,
            contentDescription = "Menú",
            tint               = FinanceColors.TextPrimary,
            modifier           = Modifier.size(28.dp)
        )
    }
}
