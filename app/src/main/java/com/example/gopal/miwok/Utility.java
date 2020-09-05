package com.example.gopal.miwok;

import java.util.ArrayList;

public class Utility {
    private Utility(){}

    public static ArrayList<Word> getColorsListFoBengali(){
        final  ArrayList<Word> colorsList = new ArrayList<Word>();
        colorsList.add(new Word("Red","laal",R.drawable.color_red, R.raw.color_red));
        colorsList.add(new Word("green","sabooj",R.drawable.color_green, R.raw.color_green));
        colorsList.add(new Word("brown","badami",R.drawable.color_brown, R.raw.color_brown));
        colorsList.add(new Word("gray","dhusar",R.drawable.color_gray, R.raw.color_gray));
        colorsList.add(new Word("black","kaalo",R.drawable.color_black, R.raw.color_black));
        colorsList.add(new Word("white","sada",R.drawable.color_white, R.raw.color_white));
        colorsList.add(new Word("dusty yellow","dhulo halud",R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        colorsList.add(new Word("mustard yellow","sarosar halud",R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
        return colorsList;
    }

    public static ArrayList<Word> getColorsListFoHindi(){
        final  ArrayList<Word> colorsList = new ArrayList<Word>();
        colorsList.add(new Word("Red","laal",R.drawable.color_red, R.raw.color_red));
        colorsList.add(new Word("green","haera",R.drawable.color_green, R.raw.color_green));
        colorsList.add(new Word("brown","bhura",R.drawable.color_brown, R.raw.color_brown));
        colorsList.add(new Word("gray","dhusar",R.drawable.color_gray, R.raw.color_gray));
        colorsList.add(new Word("black","kaala",R.drawable.color_black, R.raw.color_black));
        colorsList.add(new Word("white","safed",R.drawable.color_white, R.raw.color_white));
        colorsList.add(new Word("dusty yellow","dhul jaisa pila",R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        colorsList.add(new Word("mustard yellow","sarso jaisa pila",R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
        return colorsList;
    }

    public static ArrayList<Word> getFamilyListForBengali(){
        final ArrayList<Word> familyList = new ArrayList<Word>();
        familyList.add(new Word("father", "baba", R.drawable.family_father, R.raw.family_father));
        familyList.add(new Word("mother", "maa", R.drawable.family_mother, R.raw.family_mother));
        familyList.add(new Word("son", "putro", R.drawable.family_son, R.raw.family_son));
        familyList.add(new Word("daughter", "kan'ya", R.drawable.family_daughter, R.raw.family_daughter));
        familyList.add(new Word("older brother", "baro bhai", R.drawable.family_older_brother, R.raw.family_older_brother));
        familyList.add(new Word("younger brother", "chhoto bhai", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        familyList.add(new Word("older sister", "baro bone", R.drawable.family_older_sister, R.raw.family_older_sister));
        familyList.add(new Word("younger sister", "chhoto bone", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        familyList.add(new Word("grandmother", "tham'maa", R.drawable.family_grandmother, R.raw.family_grandmother));
        familyList.add(new Word("grandfather", "dadu", R.drawable.family_grandfather, R.raw.family_grandfather));
        return familyList;
    }

    public static ArrayList<Word> getFamilyListForHindi(){
        final ArrayList<Word> familyList = new ArrayList<Word>();
        familyList.add(new Word("father", "papa", R.drawable.family_father, R.raw.family_father));
        familyList.add(new Word("mother", "maa", R.drawable.family_mother, R.raw.family_mother));
        familyList.add(new Word("son", "bea'ta", R.drawable.family_son, R.raw.family_son));
        familyList.add(new Word("daughter", "bea'ti", R.drawable.family_daughter, R.raw.family_daughter));
        familyList.add(new Word("older brother", "bada bhai", R.drawable.family_older_brother, R.raw.family_older_brother));
        familyList.add(new Word("younger brother", "chho'ta bhai", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        familyList.add(new Word("older sister", "badee bahan", R.drawable.family_older_sister, R.raw.family_older_sister));
        familyList.add(new Word("younger sister", "chhote bahan", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        familyList.add(new Word("grandmother", "daade maa", R.drawable.family_grandmother, R.raw.family_grandmother));
        familyList.add(new Word("grandfather", "daada", R.drawable.family_grandfather, R.raw.family_grandfather));
        return familyList;
    }

    public static ArrayList<Word> getNumbersListForBengali(){
        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One","eak",R.drawable.number_one,R.raw.number_one));
        words.add(new Word("Two","dui",R.drawable.number_two,R.raw.number_two));
        words.add(new Word("Three","teen",R.drawable.number_three,R.raw.number_three));
        words.add(new Word("Four","chaar",R.drawable.number_four,R.raw.number_four));
        words.add(new Word("Five","paach",R.drawable.number_five,R.raw.number_five));
        words.add(new Word("Six","chai",R.drawable.number_six, R.raw.number_six));
        words.add(new Word("Seven","saat",R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("Eight","aath",R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("Nine","nai",R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("Ten","dasa",R.drawable.number_ten, R.raw.number_ten));
        words.add(new Word("Eleven","egara",-1, R.raw.number_ten));
        words.add(new Word("Twelve","baro",-1, R.raw.number_ten));
        words.add(new Word("Thirteen","tero",-1, R.raw.number_ten));
        words.add(new Word("Fourteen","chaudda",-1, R.raw.number_ten));
        words.add(new Word("Fifteen","panera",-1, R.raw.number_ten));
        words.add(new Word("Sixteen","sola",-1, R.raw.number_ten));
        words.add(new Word("Seventeen","satera",-1, R.raw.number_ten));
        words.add(new Word("Eighteen","aaṭhe'ra",-1, R.raw.number_ten));
        words.add(new Word("Nineteen","unisa",-1, R.raw.number_ten));
        words.add(new Word("Twenty","bis",-1, R.raw.number_ten));
        words.add(new Word("TwentyOne","ekus",-1, R.raw.number_ten));
        words.add(new Word("TwentyTwo","baise",-1, R.raw.number_ten));
        words.add(new Word("TwentyThree","teis",-1, R.raw.number_ten));
        words.add(new Word("TwentyFour","chabbisa",-1, R.raw.number_ten));
        words.add(new Word("TwentyFive","pa'chis", -1, R.raw.number_ten));
        words.add(new Word("TwentySix","cha'bbis", -1, R.raw.number_ten));
        words.add(new Word("TwentySeven","sateis", -1, R.raw.number_ten));
        words.add(new Word("TwentyEight","aathais", -1, R.raw.number_ten));
        words.add(new Word("TwentyNine","un'tris", -1, R.raw.number_ten));
        words.add(new Word("Thirty","tris", -1, R.raw.number_ten));
        words.add(new Word("ThirtyOne","eka'tris", -1, R.raw.number_ten));
        words.add(new Word("ThirtyTwo","ba'tris", -1, R.raw.number_ten));
        words.add(new Word("ThirtyThree","te'tris", -1, R.raw.number_ten));
        words.add(new Word("ThirtyFour","chau'tris", -1, R.raw.number_ten));
        words.add(new Word("ThirtyFive","pai'tris", -1, R.raw.number_ten));
        words.add(new Word("ThirtySix","chh'tris", -1, R.raw.number_ten));
        words.add(new Word("ThirtySeven","sait'ris", -1, R.raw.number_ten));
        words.add(new Word("ThirtyEight","aath'tris", -1, R.raw.number_ten));
        words.add(new Word("ThirtyNine","un'chalis", -1, R.raw.number_ten));
        words.add(new Word("Forty","chalis", -1, R.raw.number_ten));
        words.add(new Word("FortyOne","ek'chalis", -1, R.raw.number_ten));
        words.add(new Word("FortyTwo","biya'lis", -1, R.raw.number_ten));
        words.add(new Word("FortyThree","teta'lis", -1, R.raw.number_ten));
        words.add(new Word("FortyFour","chuwa'lis", -1, R.raw.number_ten));
        words.add(new Word("FortyFive","paita'lis", -1, R.raw.number_ten));
        words.add(new Word("FortySix","chia'lis", -1, R.raw.number_ten));
        words.add(new Word("FortySeven","saat'chalis", -1, R.raw.number_ten));
        words.add(new Word("FortyEight","aath'chalis", -1, R.raw.number_ten));
        words.add(new Word("FortyNine","un'panchas", -1, R.raw.number_ten));
        words.add(new Word("Fifty","pan'chas", -1, R.raw.number_ten));
        return words;
    }

    public static ArrayList<Word> getNumbersListForHindi(){
        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One","eak",R.drawable.number_one,R.raw.number_one));
        words.add(new Word("Two","do",R.drawable.number_two,R.raw.number_two));
        words.add(new Word("Three","teen",R.drawable.number_three,R.raw.number_three));
        words.add(new Word("Four","chaar",R.drawable.number_four,R.raw.number_four));
        words.add(new Word("Five","paach",R.drawable.number_five,R.raw.number_five));
        words.add(new Word("Six","chhah",R.drawable.number_six, R.raw.number_six));
        words.add(new Word("Seven","saat",R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("Eight","aath",R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("Nine","nau",R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("Ten","das",R.drawable.number_ten, R.raw.number_ten));
        words.add(new Word("Eleven","egyaarah",-1, R.raw.number_ten));
        words.add(new Word("Twelve","baa'rah",-1, R.raw.number_ten));
        words.add(new Word("Thirteen","terah",-1, R.raw.number_ten));
        words.add(new Word("Fourteen","chaudah",-1, R.raw.number_ten));
        words.add(new Word("Fifteen","pandrah",-1, R.raw.number_ten));
        words.add(new Word("Sixteen","solah",-1, R.raw.number_ten));
        words.add(new Word("Seventeen","satrah",-1, R.raw.number_ten));
        words.add(new Word("Eighteen","athaa'rah",-1, R.raw.number_ten));
        words.add(new Word("Nineteen","unnees",-1, R.raw.number_ten));
        words.add(new Word("Twenty","bees",-1, R.raw.number_ten));
        words.add(new Word("TwentyOne","ikkees",-1, R.raw.number_ten));
        words.add(new Word("TwentyTwo","baees",-1, R.raw.number_ten));
        words.add(new Word("TwentyThree","teees",-1, R.raw.number_ten));
        words.add(new Word("TwentyFour","chaubees",-1, R.raw.number_ten));
        words.add(new Word("TwentyFive","pachchees", -1, R.raw.number_ten));
        words.add(new Word("TwentySix","chhabbees", -1, R.raw.number_ten));
        words.add(new Word("TwentySeven","sattaees", -1, R.raw.number_ten));
        words.add(new Word("TwentyEight","atthais", -1, R.raw.number_ten));
        words.add(new Word("TwentyNine","untees", -1, R.raw.number_ten));
        words.add(new Word("Thirty","tees", -1, R.raw.number_ten));
        words.add(new Word("ThirtyOne","ikattees", -1, R.raw.number_ten));
        words.add(new Word("ThirtyTwo","battees", -1, R.raw.number_ten));
        words.add(new Word("ThirtyThree","tentees", -1, R.raw.number_ten));
        words.add(new Word("ThirtyFour","chauntees", -1, R.raw.number_ten));
        words.add(new Word("ThirtyFive","paintees", -1, R.raw.number_ten));
        words.add(new Word("ThirtySix","chhattees", -1, R.raw.number_ten));
        words.add(new Word("ThirtySeven","saintees", -1, R.raw.number_ten));
        words.add(new Word("ThirtyEight","adatees", -1, R.raw.number_ten));
        words.add(new Word("ThirtyNine","unataalees", -1, R.raw.number_ten));
        words.add(new Word("Forty","chaalees", -1, R.raw.number_ten));
        words.add(new Word("FortyOne","ikataalees", -1, R.raw.number_ten));
        words.add(new Word("FortyTwo","bayaalees", -1, R.raw.number_ten));
        words.add(new Word("FortyThree","taintaalees", -1, R.raw.number_ten));
        words.add(new Word("FortyFour","chavaalees", -1, R.raw.number_ten));
        words.add(new Word("FortyFive","paintaalees", -1, R.raw.number_ten));
        words.add(new Word("FortySix","chhiyaalees", -1, R.raw.number_ten));
        words.add(new Word("FortySeven","saintaalees", -1, R.raw.number_ten));
        words.add(new Word("FortyEight","adataalees", -1, R.raw.number_ten));
        words.add(new Word("FortyNine","unachaas", -1, R.raw.number_ten));
        words.add(new Word("Fifty","pachaas", -1, R.raw.number_ten));
        return words;
    }

    public static ArrayList<Word> getPhrasesListForBengali(){
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?","ka'thai ja'chhe", R.raw.phrase_where_are_you_going));
        words.add(new Word("What is your name?","taumar naam ki", R.raw.phrase_what_is_your_name));
        words.add(new Word("My name is...","aamar naam ", R.raw.phrase_my_name_is));
        words.add(new Word("How are you feeling?","keman lag'chhe", R.raw.phrase_how_are_you_feeling));
        words.add(new Word("I’m feeling good","ami bhal aa'chi", R.raw.phrase_im_feeling_good));
        words.add(new Word("Are you coming?","tumi ki aas'chh", R.raw.phrase_are_you_coming));
        words.add(new Word("Yes, I’m coming.","hei, aami aas'chhi", R.raw.phrase_yes_im_coming));
        words.add(new Word("I’m coming."," aami aas'chhi",R.raw.phrase_im_coming));
        words.add(new Word("Let’s go.","chalo", R.raw.phrase_lets_go));
        words.add(new Word("Come here.","ekhane aa'sho", R.raw.phrase_come_here));
        words.add(new Word("Thank you", "dhanyo'baad",R.raw.phrase_come_here));
        words.add(new Word("I really appreciate", "aami sat'yi prasansa kri",R.raw.phrase_come_here));
        words.add(new Word("Excuse Me", "kha'ma kre dao",R.raw.phrase_come_here));
        words.add(new Word("I'm sorry", "amai kha'ma kro",R.raw.phrase_come_here));
        words.add(new Word("What do you think?", "tumi ki bhav'cho",R.raw.phrase_come_here));
        words.add(new Word("How does that sound", "sabda'ta ke'man chil",R.raw.phrase_come_here));
        words.add(new Word("That sounds great", "khu'bei bhal",R.raw.phrase_come_here));
        words.add(new Word("Never Mind", "kichu mane karo na",R.raw.phrase_come_here));
        words.add(new Word("I'm learning Bengali", "aami bengali sikh'chi",R.raw.phrase_come_here));
        words.add(new Word("I don't understand", "aami bhujte paar'chi na",R.raw.phrase_come_here));
        words.add(new Word("Could you repeat that please", "tumi ki aarek'bar blbe",R.raw.phrase_come_here));
        words.add(new Word("Could you please talk slower", "tumi ki aaste katha bolbe",R.raw.phrase_come_here));
        words.add(new Word("Thank you", "dhanya'bad",R.raw.phrase_come_here));
        words.add(new Word("How do you spell that?", "eta keman kore bolbe",R.raw.phrase_come_here));
        words.add(new Word("What do you mean?", "aapni ki balte chai'chen",R.raw.phrase_come_here));
        words.add(new Word("Hi! I'm Richard and your name", "aamar naam Richar tomar naam",R.raw.phrase_come_here));
        words.add(new Word("Nice to meet you", "tomar sathe dekha kare bhalo laglo ",R.raw.phrase_come_here));
        words.add(new Word("Where are you from?", "tumi kotha theke ese'cho",R.raw.phrase_come_here));
        words.add(new Word("What do you do?", "tumi ki karo",R.raw.phrase_come_here));
        words.add(new Word("What do you like to do (in your free time)?", "tumi phaka samay ki karo",R.raw.phrase_come_here));
        words.add(new Word("What’s your phone number?", "tomar phone number ta ki",R.raw.phrase_come_here));
        words.add(new Word("How can I help you?", "aap'nake kibhabe sha'zaya korte pari",R.raw.phrase_come_here));
        words.add(new Word("How to respond:", "keman kare uttar debo",R.raw.phrase_come_here));
        words.add(new Word("What do you do?", "tumi ki karo",R.raw.phrase_come_here));
//        words.add(new Word("", "",R.raw.phrase_come_here));
//        words.add(new Word("", "",R.raw.phrase_come_here));
        return words;
    }

    public static ArrayList<Word> getPhrasesListForHindi(){
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?","tum kahaan ja rahe ho?", R.raw.phrase_where_are_you_going));
        words.add(new Word("What is your name?","tumhaara naam kya he?", R.raw.phrase_what_is_your_name));
        words.add(new Word("My name is...","mera naam hai...", R.raw.phrase_my_name_is));
        words.add(new Word("How are you feeling?","aap kaisa mahasoos kar rahe hain?", R.raw.phrase_how_are_you_feeling));
        words.add(new Word("I’m feeling good","main achchha mahasoos kar raha hoon", R.raw.phrase_im_feeling_good));
        words.add(new Word("Are you coming?","kya tum aa rahe ho?", R.raw.phrase_are_you_coming));
        words.add(new Word("Yes, I’m coming.","haan, aa raha hoon.", R.raw.phrase_yes_im_coming));
        words.add(new Word("I’m coming.","main aa raha hoon.",R.raw.phrase_im_coming));
        words.add(new Word("Let’s go.","chalo chalate hain.", R.raw.phrase_lets_go));
        words.add(new Word("Come here.","yahaan aao", R.raw.phrase_come_here));
        words.add(new Word("Thank you", "dhanyavaad",R.raw.phrase_come_here));
        words.add(new Word("I really appreciate", "main sachamuch prashansa karata hoon",R.raw.phrase_come_here));
        words.add(new Word("Excuse Me", "mujhe maaph karen",R.raw.phrase_come_here));
        words.add(new Word("I'm sorry", "mujhe maaph kar do",R.raw.phrase_come_here));
        words.add(new Word("What do you think?", "tum kya sochate ho?",R.raw.phrase_come_here));
        words.add(new Word("How does that sound", "vah kaisa lagata hai",R.raw.phrase_come_here));
        words.add(new Word("That sounds great", "vah bahut achchha lagata hai",R.raw.phrase_come_here));
        words.add(new Word("Never Mind", "koee baat nahin",R.raw.phrase_come_here));
        words.add(new Word("I'm learning Hindi", "main Hindi seekh raha hoon",R.raw.phrase_come_here));
        words.add(new Word("I don't understand", "mujhe samajh nahin aa raha hai",R.raw.phrase_come_here));
        words.add(new Word("Could you repeat that please", "aap krpaya use phir se dohara sakate hain",R.raw.phrase_come_here));
        words.add(new Word("Could you please talk slower", "kya aap dheemee baat kar sakate hain",R.raw.phrase_come_here));
        words.add(new Word("Thank you", "dhanyavaad",R.raw.phrase_come_here));
        words.add(new Word("How do you spell that?", "isakee vartanee kya hai?",R.raw.phrase_come_here));
        words.add(new Word("What do you mean?", "aapaka kya arth hai?",R.raw.phrase_come_here));
        words.add(new Word("Hi! I'm Richard and your name", "namaste! main richard hoon aur tumhaara naam",R.raw.phrase_come_here));
        words.add(new Word("Nice to meet you", "tomar sathe dekha kare bhalo laglo ",R.raw.phrase_come_here));
        words.add(new Word("Where are you from?", "Where are you from?",R.raw.phrase_come_here));
        words.add(new Word("What do you do?", "What do you do?",R.raw.phrase_come_here));
        words.add(new Word("What do you like to do (in your free time)?", "aap kya karana pasand karate hai",R.raw.phrase_come_here));
        words.add(new Word("What’s your phone number?", "aapaka phone number kya hai?",R.raw.phrase_come_here));
        words.add(new Word("How can I help you?", "main aapakee kya madad kar sakata hoon?",R.raw.phrase_come_here));
        words.add(new Word("How to respond:", "kaise pratikriya den:",R.raw.phrase_come_here));
        words.add(new Word("What do you do?", "aap kya karate hain?",R.raw.phrase_come_here));
//        words.add(new Word("", "",R.raw.phrase_come_here));
//        words.add(new Word("", "",R.raw.phrase_come_here));
        return words;
    }

}
