package com.firstapp.packyourbag.Data;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import com.firstapp.packyourbag.Database.RoomDB;
import com.firstapp.packyourbag.Models.Items;
import com.firstapp.packyourbag.constants.MyConstants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppData extends Application {

    RoomDB database;
    String category;
    Context context;

    public static final String LAST_VERSION = "LAST_VERSION";
    public static final int NEW_VERSION = 1;

    public AppData(RoomDB database) {
        this.database = database;
    }

    public AppData(RoomDB database, Context context) {
        this.database = database;
        this.context = context;
    }

    public List<Items> getBasicData() {
        category = "Basic Needs";
        List<Items> basicItem = new ArrayList<>();
        basicItem.clear();
        basicItem.add(new Items("Visa", category, false));
        basicItem.add(new Items("Passport", category, false));
        basicItem.add(new Items("Tickets", category, false));
        basicItem.add(new Items("Wallet", category, false));
        basicItem.add(new Items("Driving License", category, false));
        basicItem.add(new Items("Cash", category, false));
        basicItem.add(new Items("House Key", category, false));
        basicItem.add(new Items("Books", category, false));
        basicItem.add(new Items("Travel Pillow", category, false));
        basicItem.add(new Items("Eye Patch", category, false));
        basicItem.add(new Items("Umbrella", category, false));
        basicItem.add(new Items("Note Book", category, false));
        return basicItem;
    }

    public List<Items> getPersonalCareDate() {
        String[] data = {"Tooth-brush", "Tooth-paste", "Floss", "Mouth-wash", "Shaving Stick",
                "Soap", "Cream", "Shampoo", "Hair Conditioner", "Brush", "Hair Clipper",
                "Moisturizer", "Lip Cream", "Hair Dryer", "Contact Lens", "Perfume", "Deodorant",
                "MAke up Kits", "Wet Wipes", "Ear Bud", "Cotton", "Nail Polish", "Nail Polish Remover",
                "Nail Clipper", "Nail Scissors", "Nail Files"};
        return prepareItemsList(MyConstants.PERSONAL_CARE_CAMEL_CASE, data);
    }

    public List<Items> getClothingData() {
        String[] data = {"Stockings", "Under Wears", "Pyjamas", "T-Shirts", "Casual Dress",
                "Evening Dress", "Cardigan", "Evening Dress", "Vest", "Jacket", "Skirt", "Trousers",
                "Jeans", "Shorts", "Suit", "Coat", "Rain Coat", "Glove", "Hat", "Scarf", "Bikini",
                "Belt", "Slippers", "Sneakers", "Casual Shoes", "Healed Shoes", "Sport Wears"};
        return prepareItemsList(MyConstants.CLOTHING_CAMEL_CASE, data);
    }

    public List<Items> getBabyNeedsData() {
        String[] data = {"Snap Suit", "Outfit","Jumpsuit", "Baby Socks", "Baby Hat", "Pyjamas",
                "Baby Bath Towel", "Muslin", "Blanket", "Dribble Bibs", "Baby Laundry Detergent",
                "Baby Bottle", "Baby Bottle Brush", "Breast-Feeding Cover", "Water Bottle",
                "Storage Container","Baby Food Spoon", "Diaper", "Wet Wipes", "Baby Cotton",
                "Baby Shampoo", "Baby Soap", "Baby Nail Scissors", "Body Moisturizer",
                "Diaper Rash Cream","Nasal Aspirator", "Baby Backpack", "Stroller", "Toys",
                "Baby Carrier", "Playpen", "Baby Radio", "Baby Sunglasses"};
        return prepareItemsList(MyConstants.BABY_NEEDS_CAMEL_CASE, data);
    }

    public List<Items> getHealthData() {
        String[] data = {"Aspirin", "Drug Used", "Vitamins Used", "Lens Solutions", "Condoms",
                "Hot Water Bag", "Adhesive Plaster", "First Aid Kit", "Replacement Lens",
                "Pain Reliever", "Fever Reducer", "Diarrhea Stopper", "Pain Relieve Spray"};
        return prepareItemsList(MyConstants.HEALTH_CAMEL_CASE, data);
    }

    public List<Items> getTechnologyData() {
        String[] data = {"Mobile Phone", "Mobile Phone Charger", "Camera", "Camera Charger",
                "Laptop PC", "PC Charger", "Portable Speaker", "Ipad", "HeadPhone", "Mouse",
                "Extension Box", "USB Cable", "Power Bank", "Flash Light", "MP3 Player"};
        return prepareItemsList(MyConstants.TECHNOLOGY_CAMEL_CASE, data);
    }

    public List<Items> getFoodData() {
        String[] data = {"Snacks", "Sandwich", "Juice", "Tea Bags", "Coffee", "Water",
                "Chips","Chips", "Baby Food"};
        return prepareItemsList(MyConstants.FOOD_CAMEL_CASE, data);
    }

    public List<Items> getBeachSuppliesData() {
        String[] data = {"Sea Glasses", "Sea Bed", "Suntan Cream", "Beach Umbrella",
                "Swim Fins", "Beach Bag", "Beach Towel", "Beach Slippers", "Sun Bed",
                "Waterproof Clock"};
        return prepareItemsList(MyConstants.BEACH_SUPPLIES_CAMEL_CASE, data);
    }

    public List<Items> getCarSuppliesData() {
        String[] data = {"Pump", "Car JAck", "Spare CAr Key", "Accident Record Set",
                "Auto Refrigerator", "Car Cover", "Car Charger", "Jump Start Cable",
                "Window Sun Shades"};
        return prepareItemsList(MyConstants.CAR_SUPPLIES_CAMEL_CASE, data);
    }

    public List<Items> getNeedsData(){
        String[] data = {"Backpack", "Daily Bags", "Laundry Bags", "Sewing Kits",
                "Travel Lock", "Luggage Tag", "Magazine", "Sport Equipments"};
        return  prepareItemsList(MyConstants.NEEDS_CAMEL_CASE, data);
    }

    public List<Items> prepareItemsList(String category, String[] data) {
        List<String> list = Arrays.asList(data);
        List<Items> dataList = new ArrayList<>();
        dataList.clear();

        for(int i = 0; i < list.size(); i++) {
            dataList.add(new Items(list.get(i), category, false));
        }
        return dataList;
    }

    public List<List<Items>> getAllData(){
        List<List<Items>> listOfAllItems = new ArrayList<>();
        listOfAllItems.clear();
        listOfAllItems.add(getBasicData());
        listOfAllItems.add(getClothingData());
        listOfAllItems.add(getPersonalCareDate());
        listOfAllItems.add(getBabyNeedsData());
        listOfAllItems.add(getHealthData());
        listOfAllItems.add(getTechnologyData());
        listOfAllItems.add(getFoodData());
        listOfAllItems.add(getBeachSuppliesData());
        listOfAllItems.add(getCarSuppliesData());
        listOfAllItems.add(getNeedsData());
        return listOfAllItems;
    }

    public void persistAllData() {
        List<List<Items>> listOfAllItems = getAllData();
        for (List<Items> list: listOfAllItems){
            for (Items items: list){
                database.mainDao().saveItem(items);
            }
        }
        System.out.println("Data added.");
    }

    public void persistDataByCategory(String category, Boolean onlyDelete){
        try{
            List<Items> list = deleteAndGetListByCategory(category, onlyDelete);
            if (!onlyDelete){
                for (Items item: list){
                    database.mainDao().saveItem(item);
                }
                Toast.makeText(context, category + "Reset Succesfull.", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(context, category + "Reset Succesfull.", Toast.LENGTH_SHORT).show();
            }
        }catch (Exception ex){
            ex.printStackTrace();
            Toast.makeText(context, "Something Went Wrong", Toast.LENGTH_SHORT).show();
        }
    }


    private List<Items> deleteAndGetListByCategory (String category, Boolean onlyDelete){
        if (onlyDelete){
            database.mainDao().deleteAllByCategoryAndAddedBy(category,MyConstants.SYSTEM_SMALL);
        }else {
            database.mainDao().deleteAllByCategory(category);
        }

        switch (category){
            case MyConstants.BASIC_NEEDS_CAMEL_CASE:
                return getBasicData();

            case MyConstants.CLOTHING_CAMEL_CASE:
                return getClothingData();

            case MyConstants.PERSONAL_CARE_CAMEL_CASE:
                return getPersonalCareDate();

            case MyConstants.BABY_NEEDS_CAMEL_CASE:
                return getBabyNeedsData();

            case MyConstants.HEALTH_CAMEL_CASE:
                return getHealthData();

            case MyConstants.TECHNOLOGY_CAMEL_CASE:
                return getTechnologyData();

            case MyConstants.FOOD_CAMEL_CASE:
                return getFoodData();

            case MyConstants.BEACH_SUPPLIES_CAMEL_CASE:
                return getBeachSuppliesData();

            case MyConstants.CAR_SUPPLIES_CAMEL_CASE:
                return getCarSuppliesData();

            case MyConstants.NEEDS_CAMEL_CASE:
                return getNeedsData();

            default:
                return new ArrayList<>();
        }
    }
}
