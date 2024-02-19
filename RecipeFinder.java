import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//suklam bardaram vishnum sashivarnam chaturbhujam prasanna dhyaye varanam sarva vignopa shantaye
//jai Mahishmati 
//jai balayya
//jai bal
//jai tejayya
//jai nikhillaya
public class RecipeFinder {

    public static void main(String[] args) {
        List<Recipe> recipes = createIndianRecipes();

        // Input: Enter ingredients (separated by commas): chicken, tomato
        String ingredientsInput = promptForIngredients();
        String[] ingredients = ingredientsInput.split(",");

        // Processing
        List<Recipe> matchingRecipes = getAllRecipesContainingIngredients(recipes, ingredients);

        // Output: Display matching recipes
        if (!matchingRecipes.isEmpty()) {
            System.out.println("\u001B[41m"+"\t\t\tMatching recipes:"+"\u001B[0m");
            for (Recipe recipe : matchingRecipes) {
                System.out.println(recipe);
                System.out.println();
            }
        } else {
            System.out.println("No matching recipes found.");
        }
    }

    private static String promptForIngredients() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ingredients (separated by commas): ");
        return scanner.nextLine().toLowerCase().trim();
    }

    private static List<Recipe> getAllRecipesContainingIngredients(List<Recipe> recipes, String[] ingredients) {
        List<Recipe> matchingRecipes = new ArrayList<>();

        for (Recipe recipe : recipes) {
            if (recipe.containsAllIngredients(ingredients)) {
                matchingRecipes.add(recipe);
            }
        }

        return matchingRecipes;
    }

    private static List<Recipe> createIndianRecipes() {
        List<Recipe> recipes = new ArrayList<>();

        // Add your recipes here...
        // Recipe format: Recipe name, Ingredients (comma-separated), Instructions

       // Recipe 1
       Recipe curdrice = new Recipe("\u001B[32m"+"Curd Rice"+"\u001B[0m",
       "\u001B[33m"+"5 cups cooked rice, 2 cups curd, 2 tbsp cream, ¾ tsp salt, ¾ cup milk, 2 chilli chopped, 1 inch ginger grated, 2 tbsp coriander chopped, 2 tbsp oil, 1 tsp chana dal, 1 tsp urad dal, 1 tsp mustard, 1 tsp cumin, 2 tbsp cashew, 2 tbsp raisins, Few curry leaves, 1 dried red chilli, Pinch hing, 4 tbsp pomegranate",
       "\u001B[34m"+"1. Firstly, take 5 cups cooked rice and mash slightly. If the rice is cooked freshly, it is easier to mash. If you are using leftover rice, then I recommend mashing with your hand.\n" +
            "2. Add 2 cup curd, 2 tbsp cream and 3/4 tsp salt.\n" +
            "3. Mix well making sure everything is well combined.\n" +
            "4. You can see the consistency is thick, so add 3/4 cup milk and mix adjusting the consistency as required.\n" +
            "5. Now add 2 chilli, 1 inch ginger, 2 tbsp coriander and mix well.\n" +
            "6. Further, in a tadka pan heat 2 tbsp oil.\n" +
            "7. Add 1 tsp chana da, 1 tsp urad dal, 1 tsp mustard, 1 tsp cumin, 2 tbsp cashew, 2 tbsp raisins, a few curry leaves, 1 dried red chilli and pinch hing.\n" +
            "8. Splutter the tempering and pour over the curd rice.\n" +
            "9. Also, add 4 tbsp pomegranate and mix well.\n" +
            "10. Finally, enjoy Curd Rice Recipe with pickle and papad."+"\u001B[0m");
recipes.add(curdrice);

// Recipe 2
Recipe daltadka = new Recipe("\u001B[32m"+"Dal Tadka"+"\u001B[0m",
"\u001B[33m"+"For pressure cooking:\n, 1 cup toor dal, ½ cup moong dal, 2 tomato, 1 onion cubed, 10 cloves garlic, 1 bay leaf, 1 black cardamom, ½ tsp turmeric, 1 tsp salt, 2 tsp ghee, 4 cup water\n\n, For tempering:\n, 2 tbsp ghee, 4 cloves garlic sliced, 1 tsp cumin, 2 tsp kasuri methi, 1 tsp chilli powder, Pinch hing, 2 tbsp coriander chopped",
       "\u001B[34m"+"1. Firstly, in a pressure cooker take 1 cup toor dal and ½ cup moong dal. make sure to rinse the dal well.\n" +
            "2. Add 2 tomato, 1 onion, 10 cloves garlic, 1 bay leaf, 1 black cardamom, ½ tsp turmeric, and 1 tsp salt.\n" +
            "3. Also, add 2 tsp ghee and 4 cup water.\n" +
            "4. Cover and pressure cook for 5 whistles or until the dal is cooked well.\n" +
            "5. Mash the dal slightly and adjust consistency as required.\n" +
            "6. To prepare the tempering, heat 2 tbsp ghee.\n" +
            "7. Add 4 cloves garlic and fry for a minute.\n" +
            "8. Also add 1 tsp cumin, 2 tsp kasuri methi, 1 tsp chilli powder, pinch hing.\n" +
            "9. Splutter the tempering and pour over the dal.\n" +
            "10. Add in 2 tbsp coriander and mix well.\n" + 
            "11. Finally, enjoy cooker dal tadka with jeera rice.\n"+"\u001B[0m");
recipes.add(daltadka);

// recipe3
Recipe mysoremasaladosa = new Recipe("\u001B[32m"+"Mysore Masala Dosa"+"\u001B[0m",
"\u001B[33m"+"For Mysore masala dosa batter:\n 1½ cup dosa rice / Sona Masuri rice, ½ cup urad dal, 1 tbsp toor dal, 1 tbsp chana dal, ¼ tsp methi / fenugreek seeds, Water for soaking, ½ cup thin poha / Aval / flattened rice / Avalakki washed\n\nFor Aloo bhaji:\n 2 tsp oil, 1 tsp mustard / rai, ½ tsp cumin / jeera, 1 tsp chana dal, ½ tsp urad dal, Pinch of hing / asafoetida, 1 dried red chilli, Few curry leaves, ½ onion finely chopped, 1 green chilli finely chopped, 1 inch ginger finely chopped, ½ tsp turmeric / haldi, ½ tsp salt, 3 potato boiled & mashed, 2 tbsp coriander finely chopped,1 tbsp lemon juice\n\n, For red chutney:\n2 tsp oil, 2 tbsp chana dal, 1 inch ginger chopped, 3 clove garlic chopped, ½ onion finely chopped, 3 dried kashmiri red chilli, ¼ tsp turmeric / haldi, ½ tsp salt, ¼ cup water to blend\n\n, Other ingredients:\\n, ½ tsp salt, ¼ tsp sugar, Butter for roasting",
       "\u001B[34m"+"1. Firstly prepare dosa batter, red chutney and aloo bhaji.\n" +
            "2. Once the dosa batter has fermented well mix it gently.\n" +
            "3. And now add ½ tsp salt and ¼ tsp sugar to the batter and mix well.\n" +
            "4. Also heat the griddle and pour dosa.\n" +
            "5. Add in 1 tsp of butter, 1 tbsp red chutney and spread.\n" +
            "6. Also, add in potato bhaji filling.\n" +
            "7. Roast for 15-30 seconds and fold the dosa.\n" +
            "8. Finally, serve Mysore masala dosa hot with coconut chutney and sambar.\n"+"\u001B[0m");
recipes.add(mysoremasaladosa);

// recipe4
Recipe ravadosa = new Recipe("\u001B[32m"+"Rava Dosa"+"\u001B[0m",
"\u001B[33m"+"½ cup rava / semolina / suji coarse, ½ cup rice flour fine, ¼ cup maida / all purpose flour, 1 tbsp curd / yogurt optional, 1 tsp salt, 2½ cup water, 1 chilli finely chopped, 1 inch ginger grated, ½ tsp pepper crushed, 1 tsp cumin / jeera, Few curry leaves finely chopped, 2 tbsp coriander finely chopped, 1 onion finely chopped, 1½ water, Oil for roasting",
       "\u001B[34m"+"1. Firstly, in a large mixing bowl take ½ cup rava, ½ cup rice flour and ¼ cup maida.\n" +
            "2. Also add 1 tbsp curd, 1 tsp salt and 2½ cup water.\n" +
            "3. Whisk and mix well making sure there are no lumps.\n" +
            "4. Further add 1 chilli, 1 inch ginger, ½ tsp pepper, 1 tsp cumin, few curry leaves, 2 tbsp coriander and 1 onion.\n" +
            "5. Add 1½ cup water and prepare a watery consistency batter.\n" +
            "6. Rest the batter for 20 minutes making sure the rava has absorbed water.\n" +
            "7. Mix well making sure the batter is thin watery consistency.\n" +
            "8. Now carefully pour the dosa batter over very hot tawa.\n" +
            "9. Lower the flame and cook until the dosa turns golden and crisp.\n" +
            "10. Finally, fold the dosa and serve rava dosa immediately with tomato chutney or coconut chutney.\n"+"\u001B[0m");
recipes.add(ravadosa);


// recipe5
Recipe cheesygarlicbread = new Recipe("\u001B[32m"+"Cheesy Garlic Bread"+"\u001B[0m",
   "\u001B[33m"+"For dough:\n, 1 cup water warm, 2 tsp sugar, 1 tsp instant dry yeast, 2 cup maida, 2 tbsp milk powder, 1 tsp garlic crushed, 1 tsp mixed herbs, ½ tsp salt, 2 tbsp oil\n\n, For garlic butter:\n, 4 tbsp butter softened, 1 tsp garlic crushed, ½ tsp mixed herbs, ½ tsp chilli flakes\n\n, For stuffing:\n, Cheese, Sweet corn, Chilli flakes",
   "\u001B[34m"+"1. Firstly, in a large bowl take 1 cup of warm water.\n" +
           "2. Add 2 tsp sugar and 1 tsp instant dry yeast. mix well until the yeast activates.\n" +
           "3. Now add 2 cup maida, 2 tbsp milk powder, 1 tsp garlic, 1 tsp mixed herbs, ½ tsp salt and 2 tbsp oil.\n" +
           "4. Mix well making sure everything is well combined.\n" +
           "5. Start to knead the dough adding water as required.\n" +
           "6. Knead to smooth and soft dough.\n" + 
           "7. Cover and rest for 2 hours or until the dough doubles.\n" +
           "8. To prepare the garlic butter, in a bowl take 4 tbsp butter.\n" +
           "9. Add 1 tsp garlic, ½ tsp mixed herbs and ½ tsp chilli flakes.\n" +
           "10. Mix well making sure everything is well combined.\n" +
           "11. After the dough has rested for 2 hours, the dough would have doubled in size.\n" +
           "12. Punch the dough and knead slightly.\n" +
           "13. Pinch a ball-sized dough and flatten.\n" +
           "14. Place it over a plate making sure it fits into the cooker.\n" +
           "15. Now spread prepared garlic butter generously.\n" +
           "16. Top with cheese, sweet corn and chilli flakes.\n" +
           "17. Fold into half and seal the sides.\n" +
           "18. Using the knife, make mark thick strips. spread garlic butter on top of it.\n" +
           "19. Now place the bread into the preheated cooker.\n" +
           "20. Cover and cook on a medium flame for 20-25 minutes.\n" +
           "21. Brush with garlic butter and is ready to serve.\n" +
           "22. Finally, the cheesy garlic bread recipe tastes when served hot.\n"+"\u001B[0m");
recipes.add(cheesygarlicbread);


// recipe6
Recipe sambar = new Recipe("\u001B[32m"+"Sambar"+"\u001B[0m",
"\u001B[33m"+"For pressure cooking:\n, ½ cup toor dal rinsed, ¼ tsp turmeric, 1 tsp oil, 1½ cup water, ½ onion petals, 1 tomato cubed, 1 carrot chopped, 5 beans chopped, 1 potato cubed, Few drumstick, 2 brinjal chopped, Few curry leaves, 1 chilli, 2½ cup water, ½ cup tamarind extract, 2 tbsp sambar powder, 1 tsp jaggery, ½ tsp turmeric, 1 tsp salt\n\n, For tempering:\n, 2 tsp oil, 1 tsp mustard, 1 tsp urad dal, 2 dried red chilli broken, Pinch hing, Few curry leaves",
       "\u001B[34m"+"1. Firstly, in a pressure cooker add ½ cup toor dal, ¼ tsp turmeric, 1 tsp oil and 1½ cup water.\n" +
            "2. Pressure cook for 5 whistles or until the dal is cooked well.\n" +
            "3. Once the pressure releases, using a whisk mash the dal smooth.\n" +
            "4. Now add ½ onion, 1 tomato, 1 carrot, 5 beans, 1 potato, few drumstick and 2 brinjal.\n" +
            "5. Also add few curry leaves, 1 chilli and 2½ cup water.\n" +
            "6. Mix well and get to a boil.\n" +
            "7. Once the water comes to a boil, add ½ cup tamarind extract, 2 tbsp sambar powder, 1 tsp jaggery, ½ tsp turmeric and 1 tsp salt.\n" +
            "8. Mix well making sure everything is well combined.\n" +
            "9. Cover and pressure cook for 1 whistle.\n" +
            "10. Once the pressure releases, open the cooker and check for seasoning and also make sure the vegetables are cooked completely.\n" +
            "11. To prepare the tempering, heat 2 tsp oil. add 1 tsp mustard, 1 tsp urad dal, 2 dried red chilli, pinch hing and a few curry leaves.\n" +
            "12. Splutter the tempering.\n" +
            "13. Pour the tempering over the sambar and mix well.\n" +
            "14. Finally, enjoy mix veg sambar with hot steamed rice.\n"+"\u001B[0m");
recipes.add(sambar);


// recipe7
Recipe chocolatebrownie = new Recipe("\u001B[32m"+"Chocolate Brownie"+"\u001B[0m",
"\u001B[33m"+"200 grams dark chocolate 70% cocoa, ¾ cup (140 gm) butter, 1 cup ( 245 gm) sugar, ¼ cup (60 ml) curd / yogurt, 1 tsp vanilla extract, 1½ cup (215 gm) maida / plain flour, ¾ cup (60 gm) cocoa powder, ½ tsp baking powder, ¼ tsp baking soda, ¼ tsp salt, ¼ cup milk",
       "\u001B[34m"+"1. Firstly, roughly chop 200 grams dark chocolate.\n" +
            "2. Pour the melted butter over chocolate.\n" +
            "3. Stir continuously until the chocolate melts completely.\n" +
            "4. Now add in 1 cup sugar and stir well until sugar dissolves.\n" +
            "5. Also, add ¼ cup curd and 1 tsp vanilla extract.\n" +
            "6. Stir well until the mixture turns smooth and silky.\n" +
            "7. Place the sieve and add in 1½ cup maida, ¾ cup cocoa powder, ½ tsp baking powder, ¼ tsp baking soda and ¼ tsp salt.\n" +
            "8. Mix well using cut and fold method.\n" +
            "9. Now add ¼ cup milk and mix until the batter is a smooth thick consistency. do not over mix as the cake turns rubbery and chewy.\n" +
            "10. Transfer the cake batter into the square cake mould.\n" +
            "11. Bake the cake at 180 degree celsius or 356 degrees Fahrenheit for 30 minutes.\n" +
            "12. Finally, enjoy eggless brownie cake cutting into the shape of your choice.\n"+"\u001B[0m");
recipes.add(chocolatebrownie);


// recipe8
Recipe pavbhaji = new Recipe("\u001B[32m"+"Pav Bhaji"+"\u001B[0m",
"\u001B[33m"+"For bhaji:\n, 1 tbsp + 1 tbsp butter, 3 tomato finely chopped, ¼ cup peas / matar, ½ capsicum finely chopped, 2 potato boiled & mashed, 1 tsp salt, 1 tsp + ¼ tsp kashmiri red chilli powder / lal mirch powder, ¼ tsp turmeric / haldi, 1 tsp + ½ tsp pav bhaji masala, 1 tsp + 1 tsp kasuri methi / dry fenugreek leaves, 2 tbsp + 1 tbsp coriander leaves finely chopped, 1 tsp ginger garlic paste, 1 onion finely chopped, ½ lemon juice, 3 drops red food colour optional, Water to adjust consistency\n\n, To toast pav:\n, 8 pav / bread roll, 4 tsp butter, ½ tsp kashmiri red chilli powder / lal mirch powder, ½ tsp pav bhaji masala, 4 tsp coriander leaves finely chopped",
       "\u001B[34m"+"1. Firstly, in a large kadai heat 1 tbsp butter and add vegetables. cook and mash well.\n" +
            "2. Now add 1 tsp chilli powder, ¼ tsp turmeric, 1 tsp pav bhaji masala, 1 tsp kasuri methi and 2 tbsp coriander leaves.\n" +
            "3. Heat a tbsp of butter and add ¼ tsp chilli powder, ½ tsp pav bhaji masala, 1 tsp kasuri methi.\n" +
            "4. Also add 1 tbsp coriander leaves, 1 tsp ginger garlic paste, 1 onion and ½ lemon juice. saute well.\n" +
            "5. Now add 3 drops of red food colour and mix well.\n" +
            "6. Boil and mash for 5 minutes adjusting consistency.\n" +
            "7. Finally, serve pav and bhaji as pav bhaji.\n"+"\u001B[0m");
recipes.add(pavbhaji);


// recipe9
Recipe idli = new Recipe("\u001B[32m"+"Idli"+"\u001B[0m",
   "\u001B[33m"+"2 cup idli rice / dosa rice / sona masuri rice, 1 cup urad dal, ¾ cup thin poha / avalakki / aval, Oil for greasing",
   "\u001B[34m"+"1. Firstly, in a large mixing bowl soak 2 cup idli rice for 5 hours. alternatively, use dosa rice / sona masuri rice.\n" +
           "2. In another bowl soak 1 cup urad dal for 3 hours.\n" +
           "3. Drain off the water from urad dal and blend to smooth paste adding water as required.\n" +
           "4. Transfer the smooth and fluffy batter of urad dal into a large bowl.\n" +
           "5. In the blender take soaked rice and add ¾ cup of washed thin poha.\n" +
           "6. Bend to slightly coarse paste adding water as required.n" + 
           "7. Transfer the rice batter to the bowl of urad dal batter.\n" +
           "8. Mix well making sure everything is combined well.\n" +
           "9. Now cover and rest in warm place for 8-10 hours or till the batter ferments and doubles.\n" +
           "10. After 8 hours, batter doubles indicating well fermented with air pockets present.\n" +
           "11. Add 1½ tsp salt to the batter and mix well.\n" +
           "12. Mix gently without disturbing the air pockets.\n" +
           "13. Now grease the thatte idli plate with oil.\n" +
           "14. Scoop the batter into idli plate greased with oil.\n" +
           "15. Arrange the idli plate into the stand.\n" +
           "16. Steam for 20 minutes on medium flame or till a tooth pick inserted comes out clean.\n" +
           "17. Finally, thatte idlis are ready to serve along with chutney and sambar.\n"+"\u001B[0m");
recipes.add(idli);


// recipe10
Recipe chickendumbiryani = new Recipe("\u001B[32m"+"Chicken Dum Biryani"+"\u001B[0m",
"\u001B[33m"+"1 lb chicken (with bones is best. Include drumsticks, thighs), 3 onions (sliced thin), 4 tomatoes (chopped fine), 4 green chilies slit into half, 3 teaspoon ginger-garlic paste, 2 tablespoon red chilli powder, 2 tablespoon coriander powder, 1 tablespoon garam masala powder, ½ cup coriander leaves (finely chopped), ½ cup mint leaves (finely chopped), 3 tablespoon vegetable oil, 1 tablespoon ghee (clarified butter), 1 star anise, 3 cloves whole, 2 inch cinnamon sticks, salt to taste, 1 to 2 drops orange food grade colour (optional)\n\n, For rice:\n, 4 cups basmati rice (long grain rice), 1 gallon water (3 litre), 1 teaspoon vegetable oil, ½ teaspoon salt\n\n, For chicken marinade:\n, 2 teaspoon yogurt, ½ cup fried onion (also called barista), 1 teaspoon ginger-garlic paste, 1 tablespoon red chilli powder, 1 teaspoon turmeric powder, ½ teaspoon cardamom powder, 1 green chilli slit into half, 1 tablespoon lemon juice, 1 teaspoon coriander/cilantro leaves chopped, 2 teaspoon fresh mint leaves chopped, 1 teaspoon salt, ½ teaspoon ground pepper",
       "\u001B[34m"+"1. To cook basmati rice separately:-Soak basmati rice in water for about 10 minutes. Wash the rice gently ensuring to take out only starch and not break the grains. Mean while add about 4 litres of water in a large vessel and bring it to boil. Once water starts to boil, add about 1 teaspoon of cooking oil and 1 teaspoon of salt. Add the soaked and washed rice, stir gently once and cook for about 3 to 5 minutes(I usually take it off heat by 3 ½ minutes). Keep an eye on rice as some brands of basmati rice cooks very fast and some takes time. My rice was cooked in 5 minutes. Drain the water immediately and spread the rice on a large plate.\n" +
            "2. Clean and wash the chicken thoroughly for at least 3 times. Add a little salt while washing the chicken(this will help to get rid off the smell to an extent)\n" +
            "3. Marinate the chicken with ingredients mentioned under marinating list. Marinate for at least ½ hour.\n" +
            "4. In a deep bottomed pan add oil, once oil gets heated add 1 onion slices and fry it until brown (don't burn the onions). Remove browned onion from oil and keep it aside. This will be used for garnishing and will making the layers.\n" +
            "5. To the same pan add remaining onions(2 onions) slices and sauté till onions turn translucent. Next add ginger-garlic paste and sauté till the raw smell goes off.\n" +
            "6. Add slit green chilies and mix for a minute. Add chopped tomatoes and sauté till tomatoes turn slightly mushy. Next add red chilli powder, coriander powder, garam masala powder and salt(to taste, remember chicken marinate contains salt as well). Sauté for 2 minutes.\n" +
            "7. Add 3 tbsps of both coriander and mint leaves and mix. Add marinated chicken and mix well. Cook until chicken is fully cooked(chicken pieces should be very tough, if you pull the chicken flesh, it should come off from bones). DO NOT add any water as onion tomato gravy and the chicken marination (as we have used curd) will release enough water. Once chicken is cooked if you find there is excess water remove the water from the gravy and keep it aside. You can use this gravy water while layering and also can serve this with biryani along with raita. The gravy water will taste very close to “salna”.\n" +
            "8. Take the Dum pan, add ghee and spread it to coat all the bottom and sides of the pan, reduce the flame to low. Add about 2 full tbsps of the chicken gravy(remember it shouldn’t be very watery) spread all over the bottom. Next add cooked basmati rice over the chicken and gently spread the rice to cover the chicken. At this stage you can use the watery gravy that you removed in step 6. Use a tea spoon and remove the top oily layer from gravy and drizzle over the rice, this will add flavours to the rice and also give colour or you can add colours(saffron soaked in milk and orange food colour)\n" +
            "9. Repeat step 7 until you have used up all rice and chicken. Over the top sprinkle coriander and mint leaves and browned onions and close with a lid. Ensure the flame is low and place a heavy weight on top of lid to trap the steam inside. Leave it alone for 10 minutes and your dum biryani is ready.\n" +
            "10. Scoop out biryani from the edges of the pan, making sure not to break the rice grains. Serve hot with onion raita.\n"+"\u001B[0m");
recipes.add(chickendumbiryani);

Recipe grilledchicken = new Recipe("\u001B[32m"+"grilled chicken"+"\u001B[0m",
"\u001B[33m"+"1 chicken breast (skinless, boneless),1 tbsp olive oil,1 tsp ginger garlic paste,1 tsp spices powder,1 cup mix of parsley, coriander, green spring, onion,to taste salt, pepperFor the salsa:1/2 cup, spring onion (white part) chopped,1 cup cherry, tomatoes,1/2 cup green/black grapes,1 tsp green chilli chopped,1 yellow bell pepper chopped,1 tsp parsley chopped,1 tsp coriander chopped,2 Basil leaves,1 tsp lemon juice,2 tsp olive oilto taste salt, and pepper",
       "\u001B[34m"+"For the spice powder:\n"+
       "1.Add fennel, pepper, cinnamon powder, star anise, roast and grind to a powder.\n"+
       "2.Store in air tight container cool dry place.\n"
       +"For the chicken:\n"+
       "1.Blend parsley, the green part of the spring onion and coriander into a smooth green paste.\n"+
       "2.Marinate the chicken breast with salt, pepper, spice powder and green paste (for about half an hour).\n"+
       "3.Cook in a nice hot pan/ grill or bake.\n"+
       "For the salsa:\n"+
       "1.Toss all the ingredients for the salsa in a bowl, refrigerate until needed. Serve with the grilled chicken breast.\n"+"\u001B[0m");
       recipes.add(grilledchicken);


Recipe dalvada= new Recipe("\u001B[32m"+"DAL VADA"+"\u001B[0m",
       "\u001B[33m"+"Chana Dal (1 CUP) ,Onion (1 medium sized) [chopped],Green Chillies (2-3 nos)[chopped] ,Curry Leaves (10-15 nos) [chopped],Rice Flour (1 TBSP),Cumin (1 TSP),Asafoetida (a pinch) ,Salt to taste,Ginger Garlic Paste (1 TSP),Red Chilli Powder (1.5 TSP),Coriander Powder (2 TSP),Refined Oil (2 TBSP) ",
       "\u001B[34m"+"1. Soak the chana dal: Wash the chana dal thoroughly and soak it in water for at least 4 hours or overnight.\n" +
            "2.Grind the dal: Drain the soaked dal and grind it into a coarse paste without adding water. The texture should be coarse, not smooth.\n" +
            "3. Prepare the batter: Transfer the ground dal to a mixing bowl. Add chopped green chilies, ginger, garlic, onion, coriander leaves, cumin seeds, fennel seeds (if using), and salt. Mix well.\n" +
            "4. Shape the vadas: Heat oil for deep frying in a kadai or frying pan. Take a small portion of the mixture and shape it into a round flat vada. You can flatten it slightly with your palm.\n" +
            "5.Fry the vadas: Once the oil is hot, gently slide the shaped vadas into the hot oil. Fry them in batches on medium heat until they turn golden brown and crispy on both sides.\n" +
            "6. Drain excess oil: Once fried, remove the vadas using a slotted spoon and place them on a plate lined with paper towels to drain excess oil.\n" +
            "7. Serve: Serve hot dal vadas with chutney or sauce of your choice.\n" +"\u001B[0m");
recipes.add(dalvada);


Recipe samosa= new Recipe("\u001B[32m"+"samosa"+"\u001B[0m",
       "\u001B[33m"+"2 cup all purpose flour,1 teaspoon cumin seeds,1 teaspoon crushed ginger,1 teaspoon raisins,5 boiled potato,1 teaspoon coriander powder,1 teaspoon coriander powder,1 teaspoon kasoori methi leaves,1 teaspoon carom seeds,1/4 cup water,2 cup virgin olive oil,1/2 teaspoon coriander seeds,1 teaspoon green chilli,1 teaspoon cashews,1 teaspoon cumin powder,1/2 teaspoon garam masala powder,salt,1 teaspoon coriander leaves,1 teaspoon coriander leaves,2 tablespoon ghee,1 handful raw peanuts",
       "\u001B[34m"+"1 Sauté cumin seeds for potato filling\n"
       +"2 Add spices and boiled potatoes and cook for a while\n"+
       "3 Prepare the dough for the Samosa\n"+
       "4 Roll the dough in small puris and cut into half\n"+
       " 5 Fill the semi-circle with potato filling and deep fry\n"+"\u001B[0m");
recipes.add(samosa);



// recipe11
Recipe sandwich = new Recipe("\u001B[32m"+"Cheese Vegetable Grill Sandwich on Tawa\n"+"\u001B[0m",
"\u001B[33m"+"2 tbsp carrot chopped, 2 tbsp sweet corn, 2 tbsp capsicum chopped, 2 tbsp tomato chopped, 2 tbsp paneer chopped, 2 tbsp boiled potato chopped, 1 tsp schezwan chutney, ½ tsp salt, ½ tsp mixed herbs, 3 tbsp cheese grated, Bread slices, Butter for toasting, Schezwan chutney for spreading",
            "\u001B[34m"+"1. Firstly, in a bowl take 2 tbsp carrot, 2 tbsp sweet corn, 2 tbsp capsicum, 2 tbsp tomato, 2 tbsp paneer, 2 tbsp boiled potato.\n" +
            "2. Add 1 tsp schezwan chutney, ½ tsp salt, ½ tsp mixed herbs, and 3 tbsp cheese.\n" +
            "3. Mix well making sure everything is well combined.\n" +
            "4. Now take 2 bread slices and spread butter.\n" +
            "5. Also, spread schezwan chutney over the bread.\n" +
            "6. Place cheese slices and stuff in the prepared stuffing.\n" +
            "7. Place another cheese slice and cover with the bread.\n" +
            "8. Toast on a pan by applying butter.\n" +
            "9. Flip over once the bottom is golden brown.\n" +
            "10. Now spread schezwan sauce, and top with stuffing and cheese.\n" +
            "11. Also, top with mixed herbs and chilli flakes.\n" +
            "12. Cover and cook until the cheese melts.\n" +
            "13. Finally, enjoy Veg Grilled Cheese Sandwich Recipe.\n"+"\u001B[0m");
recipes.add(sandwich);


// recipe12
Recipe bcmanchurian = new Recipe("\u001B[32m"+"Baby Corn Manchuria Dry Recipe\n"+"\u001B[0m",
        "\u001B[33m"+"\nfor batter:\n½ cup maida, 2 tbsp corn flour, ½ tsp chilli powder, ½ tsp salt, 1 tsp ginger garlic paste, 10 baby corn chopped, water for batter, oil for frying\nfor manchurian sauce:\n2 tbsp oil, 4 cloves garlic finely chopped, 2 chilli chopped, 2 tbsp spring onion chopped, ½ onion chopped, ½ capsicum chopped, 2 tbsp tomato sauce, 2 tbsp soy sauce, 1 tbsp chilli sauce, 2 tbsp vinegar, ¼ tsp chilli powder, ¼ tsp pepper powder, ¼ tsp salt, ¼ tsp sugar, 3 tbsp corn flour slurry",
            "\u001B[34m"+"1. Firstly, in a large bowl take ½ cup maida, 2 tbsp corn flour, ½ tsp chilli powder, ½ tsp salt and 1 tsp ginger garlic paste.\n" +
            "2. Add water as required and prepare a smooth thick batter.\n" +
            "3. Now add 10 baby corn and coat with batter.\n" +
            "4. Deep fry in hot oil, keeping the flame on medium.\n" +
            "5. Stir occasionally, until the baby corn turns golden and crispy.\n" +
            "6. Drain off the baby corn and keep it aside.\n" +
            "7. In a large wok heat 2 tbsp oil. Add 4 cloves garlic, 2 chilli, 2 tbsp spring onion and stir fry on high flame.\n" +
            "8. Add ½ onion, ½ capsicum and stir fry on high flame.\n" +
            "9. Also add 2 tbsp tomato sauce, 2 tbsp soy sauce, 1 tbsp chilli sauce, 2 tbsp vinegar, ¼ tsp chilli powder, ¼ tsp pepper powder, ¼ tsp salt and ¼ tsp sugar.\n" +
            "10. Stir fry until all the sauces are combined well.\n" +
            "11. Now add 3 tbsp corn flour slurry and mix until the sauce thickens. To prepare the slurry, mix 1 tsp corn flour in 3 tbsp water until there are no lumps.\n" +
            "12. Once the sauce turns glossy, add in fried baby corn, 2 tbsp spring onion and toss.\n" +
            "13. Mix until the sauce is coated well.\n" +
            "14. Finally, enjoy Crispy Baby Corn Manchurian with tomato sauce.\n\n"+"\u001B[0m");
recipes.add(bcmanchurian);


// recipe13
Recipe panipuri = new Recipe("\u001B[32m"+"Pani Puri\n"+"\u001B[0m",
                        "\u001B[33m"+"\nFor puri:\n1 cup rava / semolina / suji coarse, 2 tbsp maida / plain flour, 3 tbsp oil, ¼ cup hot water, oil for frying\nFor theeka pani:\n¼ cup mint / pudina, ½ cup coriander, 1 inch ginger, 2 chilli, small ball sized tamarind, 1 tsp chaat masala, 1 tsp cumin powder, pinch hing / asafoetida, ¾ tsp salt, 4 cup cold water\nFor khatta meetha pani:\n1 cup tamarind extract, 3 tbsp jaggery / gud, 1 tsp chaat masala, 1 tsp cumin powder, ¼ tsp pepper powder, ¼ tsp kashmiri red chilli powder, pinch hing / asafoetida, ¾ tsp salt, 3 cup cold water\nFor aloo stuffing:\n3 potato / aloo boiled & mashed, ½ onion finely chopped, 2 tbsp coriander finely chopped, ½ tsp cumin powder, ½ tsp chaat masala, ¼ tsp pepper powder, ½ tsp kashmiri red chilli powder, ½ tsp salt\nFor serving:\n2 tbsp boondi",
       "\u001B[34m"+"I. Puri recipe for pani puri:\n" +
            "1. Firstly, in a large bowl take 1 cup rava and 2 tbsp maida.\n" +
            "2. Add 3 tbsp oil, crumble and mix well making sure the rava turns moist.\n" +
            "3. Now add ¼ cup hot water and start to knead.\n" +
            "4. Knead for 5 to 8 minutes or until the dough is formed.\n" +
            "5. Sprinkle water as required and knead to a smooth and soft dough.\n" +
            "6. Cover the dough and rest for 20 minutes.\n" +
            "7. After 20 minutes, continue to knead for 2 more minutes.\n" +
            "8. Now pinch a very small ball sized dough.\n" +
            "9. Roll and flatten into small disk making sure it is thin.\n" +
            "10. Deep fry in hot oil, do not overcrowd the oil.\n" +
            "11. Flip over once the puri puffs up.\n" +
            "12. Fry on medium flame until it turns golden brown and crisp from both the sides.\n" +
            "13. Drain off over kitchen paper to get rid off excess oil.\n" +
            "14. Puri is ready for pani puri. once cooled completely, you can store in an airtight container and use it for a week.\n\n" +
        "II. theeka pani preparation:\n" +
            "1. Firstly, in a small blender take ¼ cup mint, ½ cup coriander, 1 inch ginger, 2 chilli and small ball sized tamarind.\n" +
            "2. Blend to smooth paste adding water as required.\n" +
            "3. Transfer theeka pani puri paste into a large bowl.\n" +
            "4. Add 1 tsp chaat masala, 1 tsp cumin powder, pinch hing, ¾ tsp salt and 4 cup cold water.\n" +
            "5. Mix well and theeka pani is ready to enjoy with golgappa.\n\n" +
        "III. For khatta meetha pani preparation:\n" +
            "1. Firstly, in a large bowl take 1 cup tamarind extract and 3 tbsp jaggery.\n" +
            "2. Also add 1 tsp chaat masala, 1 tsp cumin powder, ¼ tsp pepper powder, ¼ tsp chilli powder, pinch hing, ¾ tsp salt and 3 cup cold water.\n" +
            "3. Mix well and khatta meetha pani is ready to enjoy with golgappa.\n\n" +
        "IV. Aloo stuffing preparation:\n" +
            "1. Firstly, in a small bowl take 3 potato, ½ onion and 2 tbsp coriander.\n" +
            "1. Also add ½ tsp cumin powder, ½ tsp chaat masala, ¼ tsp pepper powder, ½ tsp chilli powder and ½ tsp salt.\n" +
            "1. Mix well making sure everything is well combined.\n" +
            "1. Aloo stuffing is ready to enjoy with puchka.\n\n" +
        "V. Assembling pani puri for serving:\n" +
            "1. Firstly, just before serving add handful of boondi to theeka pani and khatta meetha pani.\n" +
            "1. Make a small hole in centre of puri.\n" +
            "1. Stuff a tsp of prepared aloo stuffing into puri.\n" +            
            "1. Dip into theeka pani or khatta meetha pani and enjoy.\n" +
            "1. Finally, pani puri recipe is ready to serve.\n\n"+"\u001B[0m");
recipes.add(panipuri);


Recipe friedrice = new Recipe("\u001B[32m"+"Fried Rice"+"\u001B[0m",
"\u001B[33m"+"2 cups cooked rice (preferably chilled or day-old),2 tablespoons vegetable oil,1 cup diced vegetables (carrots, peas, corn, bell peppers, etc.),1/2 cup diced onion,2 cloves garlic, minced,2 eggs, beaten,2 tablespoons soy sauce,1 tablespoon oyster sauce (optional),1 teaspoon sesame oil,Salt and pepper to taste,Green onions or cilantro for garnish (optional)",

 "\u001B[34m"+"1. Ensure that the rice is cooked and cooled. If you're using freshly cooked rice, spread it out on a tray and let it cool for a while, or refrigerate it for a few hours.\n" +
            "2.Heat 1 tablespoon of vegetable oil in a large pan or wok over medium-high heat. Add diced onions and cook until they become translucent. Add minced garlic and stir-fry for about 30 seconds.\n" +
            "3. Add the diced vegetables to the pan and stir-fry for 3-5 minutes until they are tender but still crisp. You can adjust the cooking time based on your preference for the     crunchiness of the vegetables.\n" +
            "4. Push the cooked vegetables to one side of the pan and add the remaining 1 tablespoon of oil on the empty side.\n" +
            "5. Pour the beaten eggs onto the empty side of the pan. Allow them to cook for a few seconds and then scramble them using a spatula. Once the eggs are cooked, mix them with the vegetables.\n" +
            "6. Add the chilled or day-old cooked rice to the pan. Use a spatula to break up any clumps and mix it well with the vegetables and eggs.\n" +
            "7.  Pour soy sauce, oyster sauce (if using), and sesame oil over the rice. Stir well to ensure that the rice is evenly coated with the sauces. Season with salt and pepper to taste.\n" +
            "8.Continue to stir-fry for an additional 2-3 minutes, allowing the rice to heat through and absorb the flavors. Taste and adjust the seasoning if needed.\n" +
            "9. Garnish with chopped green onions or cilantro if desired. Serve the fried rice hot on its own or as a side dish.\n\n"+"\u001B[0m");
recipes.add(friedrice);





Recipe doublekameeta = new Recipe("\u001B[32m"+"Double ka meeta\n"+"\u001B[0m",
       "\u001B[33m"+"6 slices of bread (white or brown),Ghee or unsalted butter for frying,1 cup sugar,1 cup water,1 cup milk,1/2 cup condensed milk,1/2 cup khoya (mawa), crumbled,1/2 teaspoon cardamom powder,A handful of chopped nuts (almonds, pistachios, cashews) for garnishing,Saffron strands for garnishing (optional),\n",
       "\u001B[34m"+"1. Trim the edges of the bread slices and cut them into triangles or squares as per your preference.\n" +
           "2. Heat ghee or butter in a pan over medium heat. Fry the bread slices until they turn golden brown and crispy. Ensure that both sides are evenly fried. Remove excess ghee by placing the fried slices on a paper towel.\n" +
           "3. In a separate pan, combine sugar and water to make a sugar syrup. Boil it until you get a slightly sticky consistency. Add cardamom powder to the syrup and keep it aside.\n" +
           "4. In another saucepan, heat milk over medium heat. Once it starts simmering, add condensed milk and crumbled khoya. Stir continuously to avoid lumps and let it cook until the mixture thickens.\n" +
           "5. Dip each fried bread slice into the prepared sugar syrup, ensuring they are coated evenly. Arrange the soaked slices in a serving dish.\n" +
           "6. Pour the thickened milk mixture over the soaked bread slices, making sure to cover them entirely.\n" +
           "7. Allow the Double ka Meetha to cool for a while, and then refrigerate for a few hours to let the flavors meld.\n" +
            "8. Garnish with chopped nuts and saffron strands before serving."+"\u001B[0m");
recipes.add(doublekameeta);


Recipe PapayaMilkshake = new Recipe("\u001B[32m"+"Papaya Milkshake"+"\u001B[0m",
       "\u001B[33m"+"1 cup ripe papaya, peeled, seeded, and chopped,1 cup cold milk,1-2 tablespoons honey or sugar,1/4 teaspoon vanilla extract,Ice cubes (optional)",
       "\u001B[34m"+"1.Prepare the papaya: Peel the papaya, remove the seeds, and chop it into chunks.\n" +
            "2. Blend the ingredients: In a blender, add the chopped papaya chunks, cold milk, honey or sugar (if using), and vanilla extract (if using)..\n" +
            "3. Blend until smooth: Blend everything together until you get a smooth and creamy consistency.\n" +
            "4. Adjust sweetness: Taste the milkshake and adjust the sweetness according to your preference by adding more honey or sugar if needed..\n" +
            "5. Add ice cubes (optional): If you prefer a colder milkshake, you can add a few ice cubes to the blender and blend again until they are crushed and incorporated into the milkshake..\n" +
            "6.Serve: Pour the papaya milkshake into glasses and serve immediately. You can garnish with a slice of papaya or a sprinkle of cinnamon if desired.\n" +"\u001B[0m");
recipes.add(PapayaMilkshake);

Recipe BreadOmlette= new Recipe("\u001B[32m"+"Bread Omlette"+"\u001B[0m",
       "\u001B[33m"+"2 slices of bread,2 eggs,1 small onion, finely chopped,1 small tomato, finely chopped,1-2 green chilies, finely chopped (adjust according to spice preference),2 tablespoons chopped coriander leaves,Salt to taste,1/4 teaspoon black pepper powder ,Butter or oil for cooking",
       "\u001B[34m"+"1. Prepare the bread: Lightly toast the bread slices in a toaster or on a pan until they are golden brown. Set them aside.\n" +
            "2.Beat the eggs: In a bowl, crack the eggs and beat them well until they are frothy. \n" +
            "3.Add vegetables and seasoning: To the beaten eggs, add chopped onion, tomato, green chilies, coriander leaves, salt, and black pepper powder. Mix everything well.\n" +
            "4.Cook the omelette: Heat a little butter or oil in a non-stick pan over medium heat. Pour the egg mixture onto the pan and spread it out evenly.\n" +
            "5. Place the bread: Once the edges of the omelette start to set, place the toasted bread slices on top of the egg mixture. Press them gently so that they stick to the omelette.\n" +
            "6. Flip and cook: Carefully flip the omelette with the bread slices using a spatula. Allow the other side to cook until it's golden brown and the eggs are cooked through.\n" +
            "7. Optional toppings: If you're adding cheese or any other toppings, place them on one of the bread slices while the omelette is still cooking. Then, fold the omelette over the toppings.\n" +
            "8. Serve: Once the omelette is cooked to your liking, transfer it to a plate. You can serve it as is or cut it into halves or quarters for easier eating.\n" +"\u001B[0m");
recipes.add(BreadOmlette);

Recipe Potatocurry = new Recipe("\u001B[32m"+"Potato curry"+"\u001B[0m",
       "\u001B[33m"+"3-4 medium-sized potatoes, peeled and cubed,2 tablespoons oil (vegetable oil or any cooking oil of your choice),1teaspoon cumin seeds,1 onion, finely chopped,2 tomatoes, finely chopped,2 cloves garlic, minced,1-inch piece of ginger, grated,1 green chili, slit (adjust according to spice preference),1 teaspoon turmeric powder,1 teaspoon coriander powder,1/2 teaspoon red chili powder (adjust to taste),1 teaspoon garam masala,Salt to taste,Chopped coriander leaves for garnish,Water, as needed",
       "\u001B[34m"+"1.Prepare the potatoes: Peel the potatoes and cut them into cubes. Rinse them under cold water and set them aside.\n" +
            "2. Heat oil in a pan: Heat the oil in a deep pan or skillet over medium heat.\n" +
            "3. Temper the cumin seeds: Add the cumin seeds to the hot oil and let them splutter.\n" +
            "4. Saute onions, garlic, and ginger: Add the finely chopped onions to the pan and sauté until they turn golden brown. Then, add the minced garlic and grated ginger. Cook for another minute until the raw smell disappears.\n" +
            "5. Add spices: Add the turmeric powder, coriander powder, red chili powder, and salt to the pan. Stir well to combine with the onions and spices.\n" +
            "6. Add tomatoes and cook: Add the chopped tomatoes and slit green chili to the pan. Cook until the tomatoes become soft and mushy, stirring occasionally.\n" +
            "7. Add potatoes and water: Once the tomatoes are cooked, add the cubed potatoes to the pan. Stir well to coat the potatoes with the masala mixture. Add water as needed to cover the potatoes.\n" +
            "8. Simmer and cook: Cover the pan with a lid and let the potato curry simmer on low heat until the potatoes are tender and cooked through. This usually takes about 15-20 minutes. Stir occasionally to prevent sticking.\n" +
            "9. Add garam masala: Once the potatoes are cooked, sprinkle garam masala over the curry and mix well. Cook for another minute.\n" +
            "10. Garnish and serve: Garnish the potato curry with chopped coriander leaves. Serve hot with rice, roti, or naan."+"\u001B[0m");
recipes.add(Potatocurry);


Recipe jalebi = new Recipe("\u001B[32m"+"Jalebi"+"\u001B[0m",
       "\u001B[33m"+"For the Jalebi Batter:1 cup all-purpose flour (maida),1 tablespoon rice flour,1/2 cup yogurt (curd),1/4 teaspoon baking soda.Water (as needed to make a thick batter),Oil or ghee (for deep frying),For the Jaggery Syrup:1 cup jaggery (grated or powdered),1/2 cup water,1/4 teaspoon cardamom powder",
       "\u001B[34m"+"1. In a mixing bowl, combine all-purpose flour, rice flour, yogurt, and baking soda.\n" +
            "2. Mix well to form a thick batter. Add water gradually and whisk until you get a smooth consistency without lumps.\n" +
            "3. Allow the batter to rest for 30 minutes to 1 hour for fermentation.\n" +
            "4. In a saucepan, combine jaggery and water.Heat the mixture over medium heat,stirring continuously until the jaggery dissolves completely.\n" +
            "5. Strain the syrup to remove impurities.Add cardamom powder to the strained syrup and keep it warm.\n" +
            "6. Heat oil or ghee in a deep frying pan over medium heat.Fill the jalebi batter into a squeeze bottle or a plastic bag with a small hole at one corner.\n" +
            "7. Squeeze the batter into the hot oil in a spiral or circular motion to form Jalebi shapes.Fry until they turn golden brown and crispy. Make sure to cook them on both sides.\n" +
            "8. Remove the fried jalebis and drain excess oil by placing them on paper towels.\n" +
            "9.While the jalebis are still warm, immerse them in the warm jaggery syrup.Allow them to soak for 2-3 minutes so that they absorb the sweetness.\n" +
            "10. Remove the jalebis from the syrup and arrange them on a serving plate."+"\u001B[0m");
recipes.add(jalebi);





        














        return recipes;
    }

    // Recipe class to represent each recipe
    static class Recipe {
        private String name;
        private String ingredients;
        private String instructions;

        public Recipe(String name, String ingredients, String instructions) {
            this.name = name;
            this.ingredients = ingredients;
            this.instructions = instructions;
        }

        public boolean containsAllIngredients(String[] ingredients) {
            return Arrays.stream(ingredients).allMatch(this.ingredients.toLowerCase()::contains);
        }
@Override
        public String toString() {
            return "\u001B[36m"+"Recipe: \t" + name + "\u001B[35m"+"\nIngredients: \t" + ingredients + "\u001B[31m"+"\nInstructions: \t" + instructions;
        }
    }
}
