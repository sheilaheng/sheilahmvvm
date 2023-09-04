package net.simplifiedcoding.navigation

import android.provider.ContactsContract.Contacts
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.simplifiedcoding.ui.auth.AuthViewModel
import net.simplifiedcoding.ui.auth.LoginScreen
import net.simplifiedcoding.ui.auth.SignupScreen
import net.simplifiedcoding.ui.contacts.ContactScreen
import net.simplifiedcoding.ui.home.HomeScreen
import net.simplifiedcoding.ui.projects.ProjectScreen
import net.simplifiedcoding.ui.services.ServiceScreen

@Composable
fun AppNavHost(
    viewModel: AuthViewModel,
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_LOGIN
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(ROUTE_LOGIN) {
            LoginScreen(viewModel, navController)
        }
        composable(ROUTE_SIGNUP) {
            SignupScreen(viewModel, navController)
        }
        composable(ROUTE_HOME) {
            HomeScreen(viewModel, navController)
        }
        composable(ROUTE_PROJECT) {
            ProjectScreen(viewModel, navController)
        }
        composable(ROUTE_SERVICES) {
            ServiceScreen(viewModel, navController)
        }
        composable(ROUTE_CONTACTS) {
            ContactScreen(viewModel, navController)
        }
    }
}