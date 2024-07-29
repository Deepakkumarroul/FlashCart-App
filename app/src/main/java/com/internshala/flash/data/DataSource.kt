package com.internshala.flash.data
import androidx.annotation.StringRes
import com.internshala.flash.R

object DataSource {
    fun loadCategories() : List<Categories>{
        return  listOf<Categories>(
             Categories(stringResourceId = R.string.fresh_fruits, imageResourceId = R.drawable.r),
             Categories(R.string.bath_body, R.drawable.bathbody),
             Categories(R.string.beverages, R.drawable.beverages),
             Categories(R.string.bread_biscuits, R.drawable.breadandbiscuits),
             Categories(R.string.kitchen_essentials, R.drawable.kitchen),
             Categories(R.string.munchies, R.drawable.munchies),
             Categories(R.string.packaged_food, R.drawable.packaged),
             Categories(R.string.pet_food, R.drawable.pet),
             Categories(R.string.stationery, R.drawable.stationery),
             Categories(R.string.sweet_tooth, R.drawable.sweet),
             Categories(R.string.vegetables, R.drawable.vegetables)
        )
    }
    fun loadItems(
        @StringRes categoryName:Int
    ):List<Item>{
        return listOf(
            Item(R.string.banana_robusta,R.string.fresh_fruits,"1 kg",100,R.drawable.banana),
            Item(R.string.shimla_apple,R.string.fresh_fruits,"1 kg",250,R.drawable.apple),
            Item(R.string.papaya_semi_ripe,R.string.fresh_fruits,"1 kg",150,R.drawable.papapaya),
            Item(R.string.pomegranate,R.string.fresh_fruits,"500 g",150,R.drawable.pomegrantee),
            Item(R.string.pineapple,R.string.fresh_fruits,"1 kg",130,R.drawable.pineapple),
            Item(R.string.pepsi_can,R.string.beverages,"1",40,R.drawable.pepsi)

        ).filter {
            it.itemCategoryId==categoryName
        }
    }
}