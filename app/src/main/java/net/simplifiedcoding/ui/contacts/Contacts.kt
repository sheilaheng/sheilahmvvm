package net.simplifiedcoding.ui.contacts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import net.simplifiedcoding.ui.auth.AuthViewModel

@Composable
fun ContactScreen(viewModel: AuthViewModel?, navController: NavHostController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color.Red)
            .padding(10.dp)
            .fillMaxSize()
    ) {
        Button(onClick = { },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .padding(10.dp),
        colors = ButtonDefaults.buttonColors(Color.Green)

            ) {
            Text(text = "Contact Us")
        }
    }
}