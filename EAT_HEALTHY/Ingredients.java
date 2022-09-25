import java.io.*;
import java.util.regex.*;
public class Ingredients{
	public String ingre(String recipie){
		switch(recipie){
			case "Goli Bajji" : return("1/2 Cup maida\n1 Tbsp rice flour\nA pinch of asafoetida\n5 Tbsp buttermilk/curd\n1/2 tsp salt\n1 tsp ginger\n2 green chillies, chopped3 Tbsp \ncoriander leaves,finely chopped1 sprig curry leaves\n1 tsp baking soda\nWater (as needed)\nOil (to deep fry)");

			case "Amaranth Bathua Duet With Turmeric Foam" : return("300 gms bathua\n300 gms spinach\n300 gms amaranth\n50 gms oatmeal\n50 gms millets\n50 gms gram flour,\n roasted\n8-10 Coriander leaves\n8-10 Mint leaves\n2 gram turmeric\n20 gms cream\n2 gram salt\n2 gram pepper\nA pinch of garam masala\nA pinch of white pepper powder\nA pinch of cardamom powder\n3 tsp corn flour\n2 gram cress");

			case "Egg Hakka Noodles" : return("1 packet noodles\n2 Egg\n1 Carrot\n1 Capsicum\n1 medium onion\n1 tsp vinega \n1/2 tsp soya sauce\n1/2 tsp ketchup\n1 tsp chilli sauceto taste \nsaltBlack pepper powder (as required)\nfor garnishing spring onions");

			case "Kulle Ki Chaat" : return("2 Medium potatoes,boiled\n1/4 cup small chickpeas (parboiled)\nSalt (according to taste)\nRock salt (according to taste)\nBlack chaat masala\n1/2 inch ginger, \njulienne\n1 small green chillies (cut into small pieces)\nA few pomegranate seeds\n2 tsp lemon juice");
		
			case "Chocolate Chip Cookies" : return("2 1/4 all purpose flour\n1 tsp baking soda\n1/2 tsp salt\n½ cup\n 1 stick plus\n 2 tbsp unsalted butter at room temperature\n3/4 cup granulated sugar\n3/4 cup light brown sugar\n2 Eggs\n3/4 tsp vanilla extract\n2 cups semi seet chocolate chips or high quality chocolate chunks from a bar");

			case "Gulab Badam Chikki" : return("2 Tbsp butter\n1 cup sugar\n1/8 tsp salt\n1/2 cup almonds, sliced\n1 cup dry rose petal");
		
			case "Sakkarai Pongal" : return("1 Cup rice\n1/4 cup yellow moong dal\n4 cup milk\n1 cup jaggery\n3 tsp cashewnuts\n3 tsp raisin\n5 nos cardamom\n1/4 cup ghee\n1/2 cup coconut");

			case "Christmas Cookies" : return("100 gms butter\n125 gms castor sugar\n1 eggs\n150 gms refined flour\n150 gms soaked fruit\n10 ml vanilla essence\n5 gms baking soda");
			
			case "Chocolate Appo"  : return("3/4 Cup rice\n3 tbsp coconut, grated\n1 tsp baking powder\n1 tsp vanilla extract\n1/2 tsp cinnamon powder\n1/4 cup brown sugar\n1/4 cup unsweetened cocoa powder\nA pinch of salt\n3 tbsp chocolate chips\n2-3 tbsp butter");
			
			case "Turmeric Masala Milk" : return("Turmeric\nCinnamon powder\nBlack pepper (freshly crushed)\nMilk (luke warm)");

			case "Smoothie" : return("1/4 Cup dates\n1 medium banana\n3/4 cup almond milk");

			case "Cucumber, Kale And Spinach Juice" : return("200 cucumber\n50 spinach leaves\n50 kale leaves\n1/4 inch piece ginger\n1/2 Lime to taste rock salt");

			case "orange juice" : return("75 ml Soda\n1 Lemon slices\n2 tbsp Lemon juice\nAs required Sugar");

			case "Thandai Phirni" : return("250 Gram Milk,full cream\n1/2 Cup Rice (soaked in water for at least 3 hours)\n2 Cardamoms (crushed,pods/seeds)\n15-20 strands Saffron (soaked in 2 tbsp milk)\n3 Tbsp Thandai masala powder\n1 Cup Sugar (adjustable)\n2 Tbsp Almonds & Pista, sliced");

     			case "Mango Margarita" : return("2 Mango chunks (drained)For blending Ice\n250 Ml Lemon lime soda\n2 Tbsp Sugar");

       			case "Almond Milk Thandai" : return("1/2 tsp of cardamom powder\n or 2-3 green cardamom (elaichi)\n2 tsp of poppy seeds (khus khus)\n1 tsp of fennel seeds (saunf)\n5-6 black peppercorns (kali mirch)\n3/4 tsp saffron (kesar) - \noptional1 tsp roasted watermelon seeds or\n sunflower seeds\nA pinch of nutmeg - optional\nFor the drink:\n4 cups of almond milkSeedless Dates/Raw Sugar/Palm Sugar to taste\nFor garnishing:Chopped PistachiosSilver \nLeavesPinch of Saffron");

     			case "Expresso" : return("50 ml - vodka espresso\n1 shot of espresso coffeeCappuccino foam (milk froth)\n10 ml triple sec/sugar syrupCinnamon powder\n3 coffee beans");

			case "Halwa With Vanilla Ice Cream" : return("1 Kg beetroot, medium\n250 gms ghee\n300 gms mawa\n700 gms sugar\n100 gms cashew (broken)\n4 gram cardamom powder\n2 drops ittar Vanilla ice cream");

			case "Kalakand" : return("2 Filo sheet\n10 gms butter\n15 gms blueberry\n60 gms kalakand\n30 gms carrot\n30 sugar\n30 ml saffron water\n10 gms whole fennel\n1 gram silver varq\n10 ml rabri paste\n10 ml chocolate ganache\n	5 gram pistachios, sliced");

			case "Almond And Rose Kheer" : return("2 Litre full fat milk\n120 gms rice\n40 gms grain sugar\n3-4 Rose water drops\n10 gms dried rose petals\n100 gms almonds\n25 gms almond slivers");

			case "Besan Ke Laddoo" : return("2 Cups gram flour (coarse)\n6-8 Cashew nuts\n6-8 Almonds\n1/2 cup ghee\n1/2 tsp green cardamom powder\n1/3 cup low-calorie sweetener");

			case "Red Velvet Pastry" : return("400 gram Plain Cake flour\n10 gram Cocoa Powder Unsweetened\n5 gram Baking sodaA pinch of salt\n115 gram Unsalted butter softened\n330 gram Caster Sugar\n2 gram Eggs\n250 ml Vegetable Oil\n1 tsp White Vinegar\n2 tsp Vanilla Extract\n250 ml Buttermilk\n2 tbsp Red Liquid Food Colouring\n400gram Philadelphia Cream Cheese\n115 gram Unsalted Butter\n1 ½ tsp Vanilla Extract\n450 gram Icing sugar");

			case "Kimami Sewaiyan" : return("1 Cup semiya\n1 cup khoya\n1 cup sugar\n1 cup milk\n1-1/2 cup waterghee (as needed)\n1 tsp cardarmom powder\n1 cup phool makhana (lotus seeds), chopped\n1/4 cup almonds (slivered, for garnishing)\n1 tbsp whole cashews ((slivered, for garnishing)\n1 tbsp raisins (for garnish)\n2 tbsp dry coconut (kopra)");

			case "Thandai Barfi" : return("1.5 Litre milk\n150 sugar\n50 pistachio\n0.2 saffron\n50 thandai syrup");

			case "Badam Aur Gulkand Ki Kulfi" : return("200 gms almonds whole\n40 gms gulab ki patti\n1.5 litre full fat milk\n80 gms mawa (unsweetened)\n70 gms sugarFew strands of saffron");

			case "Bamboo Biryani" : return("500 gms chicken\n2 tbsp salt\n1 tsp black pepper powder\n1/2 tsp turmeric powder\n1 tsp red chilli powder\n1 tsp coriander seeds powder\n1/2 tsp cumin seeds\n1 tsp biryani masala\n2 inch pieces ginger\n10 Garlic cloves\n4Green chilliesCoriander leavesMint leaves\n1/2 cup curd2 cups basmati rice\n4 tsp ghee/oilWhole spices\nSaffron \nwater\n Fried onions");

			case "Murgh Biryani" : return("300 gms chicken leg B/L\n5 gram green chilli\n1 small Elaichi\n1 Elaichi\n1 Cinnamon sticks\n1 gms mace\n1 Bay leaf\n1 Javitri1 gram cloves\n1 kg basmati riceto taste salt\n3 gram shahi jeera\n50 ml desi ghee\n20 gms ginger\n20gms garlic\n0.1 gram saffron\n100 gms onion\n50 gms butter\n10 gms mint\n10gms garam masala\n 30 gms red chilli powder");

			case "Veg Fried Rice" : return("2 Tbsp oil\n2 tsp ginger-garlic paste\n1/2 cup spring onion, chopped\n1/2 cup carrot, chopped\n1/2 cup cabbage, chopped\n1 capsicum, chopped\n1 tsp salt\n1 tbsp soy sauce\n1 tbsp vinegar\n1 cup rice");

			case "Green Coriander Rice" : return("1 cup brown rice\n1 green capsicum,large\n1 onion, medium\n1 tsp ginger garlic paste\n30ml curd\n2 Tbsp coriander mint and green chilli paste\n1 tsp garam masala\n1/2 tsp cumin seeds2 bay leaves\n1/2 tsp coriander powder\n1 tsp olive oil\n Salt to taste");

			case "Vegetable Biryani" : return("1 tsp cumin seeds\n1/4 cup onions-grated\n1 tsp garlic-ginger paste\n2 cups mixed vegetables-finely chopped\n2 tsp coriander powder\n1/2 tsp garam masala\n1/2 tsp turmeric powder\n2 tsp salt or to taste\n1/2 tsp chilli powder or to taste\n1 tsp green chillies-chopped fine\n1 tsp lemon juice or to taste\n1 cup rice-boiled to almost done\n1/2 cup coriander leaves\n2 Tbsp oil");
		
			default : return("\n\n");
		}
	}
	public String replacement(String recipie){
		recipie = recipie.toLowerCase();
		String result = "";
		Pattern p1 = Pattern.compile("cream");
		Matcher m1 = p1.matcher(recipie);
		if(m1.find()){
			result+="cup sour cream by \n cup yougurt for every cup of cream\n\n";
		}

		Pattern p2 = Pattern.compile("milk");
		Matcher m2 = p2.matcher(recipie);
		if(m2.find()){
			result+="cup milk by\none cup milk can be replaced with 1/2 cup evaporated milk and 1/2 cup water \n\n";
		}

		Pattern p3 = Pattern.compile("lemon juice");
		Matcher m3 = p3.matcher(recipie);
		if(m3.find()){
			result+="tbspoon lemon juice by \n1/2 teaspoon vinegar\n\n";
		}

		Pattern p4 = Pattern.compile("sugar");
		Matcher m4 = p4.matcher(recipie); 
		if(m4.find()){
			result+="cup sugar by \n 1/2 cup honey,1 cup molasses or 1/4 cup agave nectar\n\n";
		}

		Pattern p5 = Pattern.compile("maida");
		Matcher m5 = p5.matcher(recipie);
		if(m5.find()){
			result+="cup maida by \n1 cup rye or rice flour\n\n";
		}

		Pattern p6 = Pattern.compile("mayonnaise");
		Matcher m6 = p6.matcher(recipie);
		if(m1.find()){
			result+="cup mayonnaise by \n 1 cup cottage cheese or 1/8 cup mayonnaise and 7/8 cup yougurt\n\n";
		}

		Pattern p7 = Pattern.compile("egg");
		Matcher m7 = p7.matcher(recipie);
		if(m7.find()){
			result+="one egg by by \n 2 tablespoons cornstarch,arrowroot flour or potato starch or 2 egg whites or 1/2 of a large banana(mashed) for one egg\n\n";
		}

		Pattern p8 = Pattern.compile("oil");
		Matcher m8 = p8.matcher(recipie);
		if(m8.find()){
			result+="oil by \n 1/4 cup applesauce\n\n";
		}

		Pattern p9 = Pattern.compile("white bread");
		Matcher m9 = p9.matcher(recipie);
		if(m9.find()){
			result+="white bread by \n whole-grain bread\n\n";
		}
		
		Pattern p10 = Pattern.compile("cornstarch|corn starch");
		Matcher m10 = p10.matcher(recipie);
		if(m10.find()){
			result+="2 tablespoon cornstarch = 1 egg\n\n";
		}
		
		Pattern p11 = Pattern.compile("potatostarch|potato starch");
		Matcher m11 = p11.matcher(recipie);
		if(m11.find()){
			result+="2 tablespoon potatostarch = 1 egg\n\n";
		}		

		Pattern p12 = Pattern.compile("banana");
		Matcher m12 = p12.matcher(recipie);
		if(m12.find()){
			result+="1 egg in cakes\n\n";
		}
		
		Pattern p13 = Pattern.compile("applesauce|apple sauce");
		Matcher m13 = p13.matcher(recipie);
		if(m13.find()){
			result+="1/4 cup unsweetened applesauce = 1 egg\n\n";
		}

		Pattern p14 = Pattern.compile("agar agar");
		Matcher m14 = p14.matcher(recipie);
		if(m14.find()){
			result+="1 tablespoon agar agar = 1 egg\n\n";
		}
		
		Pattern p15 = Pattern.compile("ghee|butter");
		Matcher m15 = p15.matcher(recipie);
		if(m15.find()){
			result+="ghee or butter can be replaced\nwith Olive oil\n\n";
		}

		result+="-----------------------------------------------------------------------------------------------------------------------------------------------------\n------------------------------------------------------------------------------------------------------------------------------------------------";
		result+="\nWe would like to give you some measurements which would help\nyou to use how many grams or cups required";		

		result+="\n\nHow Many Grams Are In?\nOne cup of sugar =  200 grams\nOne cup of flour = 120 grams\nOne cup of butter =  227 grams\nOne cup of dry rice = 185 grams\nOne cup of powdered sugar = 120 grams\nOne cup of chocolate chips = 240 grams\nOne cup of almond flour = 112 grams\n\n";

		result+="\nAlways consult your physician before making significant changes to your diet\nAlong with good diet regular exercise makes you healthy and fit";
		return(result);

	}
}
