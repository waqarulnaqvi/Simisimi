package com.syedwaqarul.simisimi.ui.theme.Navigation


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.PersonAddAlt
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Chat
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.PersonAddAlt
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.syedwaqarul.loginapp.ui.theme.SplashScreen.SplashScreen
import com.syedwaqarul.simisimi.ui.theme.Screens.DashboardScreen
import com.syedwaqarul.simisimi.ui.theme.Screens.Discover_Screen
import com.syedwaqarul.tipcalculator.Navigation.Navigationitems

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Bottom_Navigation() {
    val navigationController= rememberNavController()
    val items = listOf(
        BottomNavigationItem(
            title = "Discover",
            selectedIcon = Icons.Filled.DateRange,
            unselectedIcon = Icons.Outlined.DateRange,
            hasNews = false
        ),
        BottomNavigationItem(
            title = "Find a member",
            selectedIcon = Icons.Filled.PersonAddAlt,
            unselectedIcon = Icons.Outlined.PersonAddAlt,
            hasNews = false,
            badgeCount = 45
        ),
        BottomNavigationItem(
            title = "Settings",
            selectedIcon = Icons.Filled.Chat,
            unselectedIcon = Icons.Outlined.Chat,
            hasNews = true
        ),
        BottomNavigationItem(
            title = "Profile",
            selectedIcon = Icons.Filled.AccountCircle,
            unselectedIcon = Icons.Outlined.AccountCircle,
            hasNews = false
        )
    )
    var selectedItemIndex by rememberSaveable {
        mutableStateOf(0)
    }
    Scaffold(
        bottomBar = {
            NavigationBar {
                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = selectedItemIndex == index,
                        onClick = {
                            selectedItemIndex = index

//                                        navHostController.navigate(item.title)
                            navigationController.navigate(item.title)

                        },
                        label = {
                            Text(text = item.title,
                                fontSize = 11.sp)
                        },
                        icon = {
                            BadgedBox(
                                badge = {
                                    if (item.badgeCount != null) {
                                        Badge {
                                            Text(text = item.badgeCount.toString())
                                        }
                                    } else if (item.hasNews) {
                                        Badge()
                                    }
                                }
                            ) {
                                Icon(
                                    imageVector = if (index == selectedItemIndex) {
                                        item.selectedIcon
                                    } else item.unselectedIcon,
                                    contentDescription = item.title
                                )
                            }
                        }
                    )
                }
            }
        }
    )
    {paddingValues->
        NavHost(
            navController = navigationController,
            startDestination = Navigationitems.discoverScreen.route
        )
        {

            composable(Navigationitems.splashScreen.route)
            {
                SplashScreen()
            }


            composable(Navigationitems.discoverScreen.route) {

                Discover_Screen()
            }
            composable(Navigationitems.dashboardScreen.route)
            {
                DashboardScreen()
            }
            composable(Navigationitems.Screen.route)
            {
                Discover_Screen()
            }
        }




    }



}

data class BottomNavigationItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val hasNews: Boolean,
    val badgeCount: Int? = null
)


//@Preview
//@Composable
//fun BottomNavigationPrev() {
//    Bottom_Navigation()
//
//}