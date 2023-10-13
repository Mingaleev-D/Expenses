package com.example.expenses.ui.util

import androidx.compose.ui.graphics.Color
import com.example.expenses.R
import com.example.expenses.ui.theme.businessBg
import com.example.expenses.ui.theme.clothBg
import com.example.expenses.ui.theme.electricBg
import com.example.expenses.ui.theme.food_drink
import com.example.expenses.ui.theme.gadgetBg
import com.example.expenses.ui.theme.giftBg
import com.example.expenses.ui.theme.groceryBg
import com.example.expenses.ui.theme.healthBg
import com.example.expenses.ui.theme.homeBg
import com.example.expenses.ui.theme.leisureBg
import com.example.expenses.ui.theme.miscBg
import com.example.expenses.ui.theme.petBg
import com.example.expenses.ui.theme.schBg
import com.example.expenses.ui.theme.snackBg
import com.example.expenses.ui.theme.subBg
import com.example.expenses.ui.theme.taxiBg
import com.example.expenses.ui.theme.travelBg
import com.example.expenses.ui.theme.vehicleBg

enum class Category(
    val title: String,
    val iconRes: Int,
    val bgRes: Color,
    val colorRes: Color = Color.White,
) {
    FOOD_DRINK("Food & Drink", R.drawable.drink, food_drink, Color.Black),
    CLOTHING("Clothing", R.drawable.clothing, clothBg, Color.Black),
    HOME("Home", R.drawable.home, homeBg, Color.Black),
    HEALTH("Health", R.drawable.health, healthBg),
    SCHOOL("School", R.drawable.school, schBg),
    GROCERY("Grocery", R.drawable.grocery, groceryBg, Color.Black),
    ELECTRICITY("Electricity", R.drawable.electricity, electricBg, Color.Black),
    BUSINESS("Business", R.drawable.business, businessBg, Color.Black),
    VEHICLE("Vehicle", R.drawable.vehicle, vehicleBg),
    TAXI("Taxi", R.drawable.taxi, taxiBg),
    LEISURE("Leisure", R.drawable.leisure, leisureBg, Color.Black),
    GADGET("Gadget", R.drawable.gadget, gadgetBg),
    TRAVEL("Travel", R.drawable.travel, travelBg, Color.Black),
    SUBSCRIPTION("Subscription", R.drawable.sub, subBg),
    PET("Pet", R.drawable.pet, petBg, Color.Black),
    SNACK("Snack", R.drawable.snack, snackBg, Color.Black),
    GIFT("Gift", R.drawable.gift, giftBg, Color.Black),
    MISC("Miscellaneous", R.drawable.misc, miscBg)
}
