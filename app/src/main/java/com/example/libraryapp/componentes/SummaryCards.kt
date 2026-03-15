package com.example.libraryapp.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
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

@Composable
fun SummarySection() {
    Row(
        modifier              = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .height(290.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Card(
            modifier  = Modifier
                .weight(1f)
                .fillMaxHeight(),
            shape     = RoundedCornerShape(20.dp),
            colors    = CardDefaults.cardColors(containerColor = FinanceColors.CardGreen),
            elevation = CardDefaults.cardElevation(0.dp)
        ) {
            Column(
                modifier            = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier         = Modifier
                        .size(52.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFD0E8DC)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector        = Icons.Default.Face,
                        contentDescription = null,
                        tint               = FinanceColors.TextPrimary,
                        modifier           = Modifier.size(30.dp)
                    )
                }

                Spacer(Modifier.height(16.dp))

                Text(
                    text  = "Actividad",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color      = FinanceColors.TextPrimary,
                        fontSize   = 17.sp
                    )
                )
                Text(
                    text  = "de la Semana",
                    style = MaterialTheme.typography.bodySmall.copy(
                        color    = FinanceColors.TextSecondary,
                        fontSize = 13.sp
                    )
                )
            }
        }

        Column(
            modifier            = Modifier
                .weight(1f)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Card(
                modifier  = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                shape     = RoundedCornerShape(20.dp),
                colors    = CardDefaults.cardColors(containerColor = FinanceColors.CardCream),
                elevation = CardDefaults.cardElevation(0.dp)
            ) {
                Column(
                    modifier            = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text  = "Ventas",
                        style = MaterialTheme.typography.bodyMedium.copy(
                            color    = FinanceColors.TextCardMuted,
                            fontSize = 14.sp
                        )
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text  = "$280.99",
                        style = MaterialTheme.typography.titleLarge.copy(
                            fontWeight = FontWeight.Bold,
                            color      = FinanceColors.TextPrimary,
                            fontSize   = 20.sp
                        )
                    )
                }
            }

            Card(
                modifier  = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                shape     = RoundedCornerShape(20.dp),
                colors    = CardDefaults.cardColors(containerColor = FinanceColors.CardLavender),
                elevation = CardDefaults.cardElevation(0.dp)
            ) {
                Column(
                    modifier            = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text  = "Ganancias",
                        style = MaterialTheme.typography.bodyMedium.copy(
                            color    = FinanceColors.TextCardMuted,
                            fontSize = 14.sp
                        )
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text  = "$280.99",
                        style = MaterialTheme.typography.titleLarge.copy(
                            fontWeight = FontWeight.Bold,
                            color      = FinanceColors.TextPrimary,
                            fontSize   = 20.sp
                        )
                    )
                }
            }
        }
    }
}
