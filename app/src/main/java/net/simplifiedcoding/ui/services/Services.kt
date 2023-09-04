package net.simplifiedcoding.ui.services

import android.app.Service
import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import net.simplifiedcoding.ui.auth.AuthViewModel


@Composable
fun ServiceScreen(viewModel: AuthViewModel?, navController: NavHostController) {
    Column(
        modifier = Modifier
            .background(Color.Gray)
            .fillMaxSize()
            .padding(10.dp)

    ) {
Text(text = "This is the Services Screen", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    }
}