package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		int birdsOnBranch = 4;
        int birdsThatFlewAway = 1;
        int birdsThatRemain = birdsOnBranch - birdsThatFlewAway;
        System.out.println("1. There are " + birdsThatRemain 
        		+ " birds remaining");

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
        int nestlessBirds = 6;
        int availableNests = 3;
        int homelessBirds = nestlessBirds - availableNests;
        System.out.println("2. There are " + homelessBirds 
        		+ " more birds than there are avaiable nests");

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int racoonsPlaying = 3;
        int racoonsEatingDinner = 2;
        int remainingRacoonsPlaying = racoonsPlaying - racoonsEatingDinner;
        System.out.println("3. There is/are " + remainingRacoonsPlaying 
        		+ " racoon(s) left playing in the woods");
       
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
        int flowersForBees = 5;
        int beesLookingForFlowers = 3;
        int beesLessFlowers = flowersForBees - beesLookingForFlowers;
        System.out.println("4. There are " + beesLessFlowers 
        		+ " less bees than flowers");
        
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
        int lonelyPigeon = 1;
        int uninvitedPigeon = 1;
        int totalDiningPigeons = lonelyPigeon + uninvitedPigeon;
        System.out.println("5. There are " + totalDiningPigeons 
        		+ " pigeons eating breadcrumbs");
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
        int originalFenceOwls = 3;
        int newjackFenceOwls = 2;
        int sumOfAllOwls = originalFenceOwls + newjackFenceOwls;
        System.out.println("6. There are a total of " 
        		+ sumOfAllOwls 
        		+ " owls sitting on the fence");
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
        int builderBeavers = 2;
        int millenialBeavers = 1;
        int remainingBuiderBeavers = builderBeavers - millenialBeavers;
        System.out.println("7. There is/are " + remainingBuiderBeavers 
        		+ " beaver(s) still working on their home");
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
        int fridayToucans = 2;
        int feliciaToucan = 1;
        int sumOfAllToucans = fridayToucans + feliciaToucan;
        System.out.println("8. Craig and Smokey the toucan were "
        		+ "chillin on a limb when Felicia rolled up to their limb. There are now " 
        		+ sumOfAllToucans + " toucans chilling on the limb.  "
        		+ "Craig quickly dismissed Felicia Toucan and said 'Bye Felcia'.");
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
        int nutlessSquirrels = 4;
        int nutsAvailable = 2;
        int squirrelsLessNuts = nutlessSquirrels - nutsAvailable;
        System.out.println("9. The are " + squirrelsLessNuts 
        		+ " more squirrels than there are nuts");
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
        int quarter = 25;
        int dime = 10;
        int nickel = 05;
        double MrsHiltSum = quarter + dime + (nickel * 2);
        System.out.println("10. Mrs. Hilt had $" + MrsHiltSum * .01);
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
        int brierClass = 18;
        int macadamsClass = 20;
        int flanneryClass = 17;
        int sumOfAllMuffins = brierClass + macadamsClass + flanneryClass;
        System.out.println("11. Mrs. Hilt's favorite 1st grade classes baked a total of " + sumOfAllMuffins + " muffins");
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
        int yoyoCost = 24;
        int whistleCost = 14;
        int sumOfAllToys = yoyoCost + whistleCost;
        double convertToCash = sumOfAllToys * .01;
        System.out.println("12. Mrs. Hilt spend $" + convertToCash + " on the toys");
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
        int largeMarshmallows = 8;
        int miniMarshmallows = 10;
        int sumOfAllMarshmallows = largeMarshmallows + miniMarshmallows;
        System.out.println("13. Mrs. Hilt used a total of " 
        		+ sumOfAllMarshmallows + " marshmallows");
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
        int snowAtHilt = 29;
        int snowAtBrecknock = 17;
        int hiltLessBrecknockSnow = snowAtHilt - snowAtBrecknock;
        System.out.println("14. Mrs. Hilt had " 
        		+ hiltLessBrecknockSnow + "-inches more snowfall than Brecknock Elementary");
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
        int mrsHiltsWallet = 10;
        int toyTruck = 3;
        int pencil = 2;
        int costOfToys = mrsHiltsWallet - (toyTruck + pencil);
        System.out.println("15. Mrs. Hilt has $" + costOfToys + " left");
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
        int joshMarbles = 16;
        int joshLessMarbles = 7;
        int joshMarblesLeft = joshMarbles - joshLessMarbles;
        System.out.println("16. Technically Josh has " 
        		+ joshMarblesLeft 
        		+ " marbles, but we all know Josh holds all the marbles");
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
        int megansSeashells = 19;
        int desiredSeashells = 25;
        int seashellsNeeded = desiredSeashells - megansSeashells;
        System.out.println("17. Megan would need another " 
        		+ seashellsNeeded + " seashells to reach " 
        		+ desiredSeashells +  " total");
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
        int bradsBalloons = 17;
        int redBalloons = 8;
        int greenBallons = bradsBalloons - redBalloons;
        System.out.println("18. Brad has " + greenBallons 
        		+ " green balloons" + " (see also: 8 balloons too many)");
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
        int booksOnShelf = 38;
        int addedBooks = 10;
        int sumOfAllBooks = booksOnShelf + addedBooks;
        System.out.println("19. There are now " + sumOfAllBooks 
        			+ " on the shelf");
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
        int beesLegs = 6;
        int eightBees = beesLegs * 8;
        System.out.println("20. 8 bees would have a total of " 
        		+ eightBees + " legs");
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
        int iceCreamCone = 99;
        int twoCones = iceCreamCone * 2;
        System.out.println("21. 2 Ice cream cones would cost $" 
        		+ twoCones * .01);
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        int completeBorder = 125;
        int hiltRocks = 64;
        int rocksNeeded = completeBorder - hiltRocks;
        System.out.println("22. Mrs. Hilt would need an additional " 
        		+ rocksNeeded + " rocks to complete her border");
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
        int mrsHiltMarbles = 38;
        int lostMarbles = 15;
        int mrsHiltRemainingMarbles = mrsHiltMarbles - lostMarbles;
        System.out.println("23. Mrs. Hilt has " 
        		+ mrsHiltRemainingMarbles + " marbles remaining");
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        int milesToConcert = 78;
        int milesToGasStation = 32;
        int milesLeftToConcert = milesToConcert - milesToGasStation;
        System.out.println("24. They had " + milesLeftToConcert + " miles to go");
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
        double timeShoveling1 = 90;
        double timeShoveling2 = 45;
        double totalTimeShoveling = (timeShoveling1 + timeShoveling2) / 60;
        System.out.println("25. Mrs. Hilt spent " + totalTimeShoveling 
        		+ " hours shoveling");
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        double hotdogs = 6;
        double hotdogCost = .50;
        double theBill = (hotdogs * hotdogCost);
        System.out.println("26. Mrs. Hilt spent $" + theBill + " on the hotdogs");
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
        double hilts50Cents = .50;
        double costOfPencil = .07;
        double amountsOfPencils = hilts50Cents / costOfPencil;
        System.out.println("27. Mrs. Hilt can purchase " 
        + amountsOfPencils + " pencils");
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        int butterflies = 33;
        int orangeButterflies = 20;
        int redButterflies = butterflies - orangeButterflies;
        System.out.println("28. There were " + redButterflies + " red butterflies");
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        double kateMoney = 1.00;
        double candyCost = .54;
        double katesChange = kateMoney - candyCost;
        System.out.println("29. Kate should get $" + katesChange + " back");
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        double marksTrees = 13;
        double plantedTrees = 12;
        double allTheTrees = marksTrees + plantedTrees;
        System.out.println("30. Mark will have " + allTheTrees + " trees");
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
        double daysUntilGrandma = 2;
        double daysConvertedToHours = daysUntilGrandma * 24;
        System.out.println("31. It will be " + daysConvertedToHours + " until Joy ses her grandmother");
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        double kimsCousins = 4;
        double pcsOfGum = 5;
        double gumForEachCousin = kimsCousins * pcsOfGum;
        System.out.println("32. Kim will need " + gumForEachCousin + " pieces of gum");
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
        double dansMoney = 3.00;
        double dansCandy = 1.00;
        double dansMoneyLeft = dansMoney - dansCandy;
        System.out.println("33. Dan will have $" + dansMoneyLeft + " left over");
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        double boatsOnTheLake = 5;
        double peopleOnBoats = 3;
        double totalPeopleOnTheLake = boatsOnTheLake + peopleOnBoats;
        System.out.println("34. There are " + totalPeopleOnTheLake + " on the lake");
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
        int ellensLegos = 380;
        int lostLegos = 57;
        int legosLeft = ellensLegos - lostLegos;
        System.out.println("35. Ellen has " + legosLeft + " legos left");
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        int arthursMuffins = 35;
        int eightythreeMuffins = 83;
        int muffinsArthurNeeds = eightythreeMuffins - arthursMuffins;
        System.out.println("36. Arthur needs " + muffinsArthurNeeds + " muffins");
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        double willysCrayons = 1400;
        double lucysCrayons = 290;
        double crayonDifference = willysCrayons - lucysCrayons;
        System.out.println("37. Willy has " + crayonDifference + " more crayons than Lucy");
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        int stickersOnPage = 10;
        int pagesOfStickers = 22;
        int totalStickers = stickersOnPage * pagesOfStickers;
        System.out.println("38. The total number of stickers you would have is " + totalStickers);
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        int totCupcakes = 96;
        int numChild = 8;
        int evenSplit = totCupcakes / numChild;
        System.out.println("39. Each child would get " + evenSplit + " cupcakes");
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
        double ginCookies = 47;
        double jarOfSix = 6;
        double notInJar;
        notInJar = (ginCookies % jarOfSix);
        System.out.println("40. " + notInJar + " cookies will not be in a jar");

        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
        int croissants = 59;
        int neightbors = 8;
        int mariansLeftovers = croissants % neightbors;
        System.out.println("41. Marian will have " + mariansLeftovers + " cookies leftover");
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
        double cookiesNeeded = 276;
        double cookiesOnTray = 12;
        double traysNeeded = cookiesNeeded / cookiesOnTray;
        System.out.println("42. Marian will need " + traysNeeded + " trays");
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        double biteSizePretzels = 480;
        double pretzelServing = 12;
        double servingsTotal = biteSizePretzels / pretzelServing;
        System.out.println("43. Marian prepared " + servingsTotal + " servings");
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
        int lemonCupcakes = 53;
        int cupcakesInBox = 3;
        int cupcakesLeftHome = 2;
        int boxesGivenAway = (lemonCupcakes - cupcakesLeftHome) / cupcakesInBox;
        System.out.println("44. " + boxesGivenAway + " boxes given away");
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
        int carrotSticks = 74;
        int peopleEating = 12;
        int carrotSticksUneaten = carrotSticks % peopleEating;
        System.out.println("45. there would be " + carrotSticksUneaten + " carrot sticks uneaten");
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
        int teddyBears = 98;
        int bearsOnShelf = 7;
        int bearFilledShelves = teddyBears / bearsOnShelf;
        System.out.println("46. There would be a total of " + bearFilledShelves + " shelves filled");
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
        double photoAlbumCapacity = 20;
        double familyPhotos = 480;
        double albumsNeeded = familyPhotos / photoAlbumCapacity;
        System.out.println("47. it will take " + albumsNeeded + " photo albums");
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
        double joesTradingCards = 94;
        double cardBoxCapacity = 8;
        double cardBoxesFilled = joesTradingCards / cardBoxCapacity;
        double cardBoxUnfilled = joesTradingCards % cardBoxCapacity;
        System.out.println("48. There would be " + cardBoxesFilled + " boxes filled with " + cardBoxUnfilled + " cards in the unfilled box");
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
        double fathersBooks = 210;
        double availableShelves = 10;
        double booksPerShelf = (fathersBooks / availableShelves);
        System.out.println("49. There would be " + booksPerShelf + " books on each shelf");
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
        double cristinasCroissants = 17;
        double cristinasGuests = 7;
        double croissantsForguests = cristinasCroissants / cristinasGuests;
        System.out.println("50. each guest would receive approx. " + croissantsForguests + " croissants each");
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
        double roomSizeDim1 = 12;
        double roomSizeDim2 = 14;
        double numOfRooms = 5;
        double timeToPaintRoomBill = 2.15;
        double timeToPaintRoomJill = 1.90;
        double hoursPerDay = 8;
        double totalRoomsToPaint = 623;
        double combinedHourRate = (timeToPaintRoomBill + timeToPaintRoomJill) / 2;
        double billSqFtHr = (roomSizeDim1 * roomSizeDim2 ) / timeToPaintRoomBill;
        double jillSqFtHr = (roomSizeDim1 * roomSizeDim2 ) / timeToPaintRoomJill;






        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */


	}

}
