package com.syedwaqarul.tipcalculator.Navigation

sealed class Navigationitems(var route:String) {

    object splashScreen: Navigationitems("Settings")
    object Screen: Navigationitems("Profile")
    object dashboardScreen: Navigationitems("Find a member")
    object discoverScreen: Navigationitems("Discover")
}