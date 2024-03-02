//package com.syedwaqarul.tipcalculator.Navigation
//
//import androidx.compose.runtime.Composable
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import com.syedwaqarul.loginapp.ui.theme.SplashScreen.SplashScreen
//import com.syedwaqarul.simisimi.ui.theme.Navigation.Bottom_Navigation
//import com.syedwaqarul.simisimi.ui.theme.Screens.DashboardScreen
//import com.syedwaqarul.simisimi.ui.theme.Screens.Discover_Screen
//
//
//@Composable
//fun Navigation(navHostController: NavHostController) {//navHostController is a jetpack compose type controller
//
//    NavHost(
//        navController = navHostController,
//        startDestination = Navigationitems.splashScreen.route
//    )
//    {
//
//        composable(Navigationitems.splashScreen.route)
//        {
//           SplashScreen(navHostController)
//        }
//
//        composable(Navigationitems.bottomNavigation.route) {
//                  Bottom_Navigation(navHostController)
//        }
//        composable(Navigationitems.discoverScreen.route) {
//
//            Discover_Screen()
//        }
//        composable(Navigationitems.dashboardScreen.route)
//        {
//            DashboardScreen()
//        }
//    }
//
//
//}
//
