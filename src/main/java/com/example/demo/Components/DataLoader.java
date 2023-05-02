package com.example.demo.Components;

import com.example.demo.Models.Beach;
import com.example.demo.Models.Creature;
import com.example.demo.Models.CreatureBeach;
import com.example.demo.Repositories.BeachRepository;
import com.example.demo.Repositories.CreatureBeachRepository;
import com.example.demo.Repositories.CreatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Profile("!test") //Run every time EXCEPT Tests
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BeachRepository beachRepository;

    @Autowired
    CreatureRepository creatureRepository;

    @Autowired
    CreatureBeachRepository creatureBeachRepository;

    public DataLoader (){

    }

    public void run(ApplicationArguments args) {


        //Fish
        Creature BallanWrasse = new Creature("Fish", "Ballan Wrasse", "BallanWrasse.png", "Up to 50cm", "Often found around rocky crevices in seas around the UK throughout the year.", "Common");
        creatureRepository.save(BallanWrasse);

        Creature CommonBlenny = new Creature("Fish", "Common Blenny", "CommonBlenny.jpeg", "Up to 17cm", "A common sight in rock pools all around the UK throughout the year", "Common. Have been known to bite if caught!");
        creatureRepository.save(CommonBlenny);

        Creature TwoSpotGoby = new Creature("Fish", "Two-Spot Goby", "TwoSpottedGoby.jpeg", "Up to 6cm", "Usually found hovering amongst seaweed and sea grass between March - October.", "Common");
        creatureRepository.save(TwoSpotGoby);

        Creature JuvenileCod = new Creature("Fish", "Juvenile Cod", "JuvenileCod.jpeg","A few cm, reaching over 1.5m when adult","Usually found sheltered close to the seabed, venturing into deeper waters as size increases.","Vulnerable, due to heavy fishing.");
        creatureRepository.save(JuvenileCod);


        //Crustacean
        Creature ShoreCrab = new Creature("Crustacean", "Shore Crab", "ShoreCrab.jpeg", "Up to 9cm shell width", "Easily found in rock pools and shallow waters throughout the year.", "Common");
        creatureRepository.save(ShoreCrab);

        Creature HarbourCrab = new Creature("Crustacean", "Harbour Crab", "HarbourCrab.jpeg", "Up to 5cm shell width", "Found on all UK coasts throughout the year, usually on the lower shore on fine, muddy sand or gravel.", "Common");
        creatureRepository.save(HarbourCrab);

        Creature VelvetSwimmingCrab = new Creature("Crustacean", "Velvet Swimming Crab", "VelvetSwimmingCrab.jpeg", "Up to 10cm shell width", "Found on all UK coasts throughout the year, often in rock pools.", "Common - notoriously feisty and can give a painful nip!");
        creatureRepository.save(VelvetSwimmingCrab);

        Creature HermitCrab = new Creature("Crustacean", "Hermit Crab", "HermitCrab.jpeg", "Up to 3.5cm length", "These crabs live in empty seashells, found on rocky shores throughout the year.", "Common");
        creatureRepository.save(HermitCrab);


        //Snails

        Creature Dogwhelk = new Creature("Snail", "Dogwhelk", "DogWhelk.jpeg", "3 - 6cm", "Found on the lower shore wherever there are barnacles or mussels", "Common");
        creatureRepository.save(Dogwhelk);

        Creature Limpet = new Creature("Snail", "Limpet", "CommonLimpet.jpeg", "Up to 4cm length", "Easily spotted on most UK shores throughout the year. ", "Common");
        creatureRepository.save(Limpet);

        Creature Periwinkle = new Creature("Snail", "Periwinkle", "Periwinkle.jpeg", "3-5cm height", "Found on rocks and seaweeds around the middle to lower parts of the shore throughout the year.", "Common");
        creatureRepository.save(Periwinkle);

        Creature Topshell = new Creature("Snail", "Topshell", "Topshell.jpeg", "1-2cm height, 2cm across", "One of the most common and colourful sea snails you're likely to see in rock pools around the UK throughout the year.", "Common");
        creatureRepository.save(Topshell);


        //Other Invertebrates

        Creature PeacockWorm = new Creature("Other Invertebrate","Peacock Worm","PeacockWorm.jpeg","30cm long, 4mm wide","On stones in sandy or muddy seabeds","Common");
        creatureRepository.save(PeacockWorm);

        Creature BeadletAnemone = new Creature("Other Invertebrate","Beadlet Anemone","BeadletAnemone.jpg","5cm diameter","Mostly seen as dark red blobs in rock pools around the UK throughout the year.","Common");
        creatureRepository.save(BeadletAnemone);

        Creature SnakelocksAnemone = new Creature("Other Invertebrate","Snakelocks Anemone","SnakelocksAnemone.jpeg","Diameter up to 8cm, with tentacles up to 15cm long","Attached to rocks on the low shore and shallow seas, down to about 12m. Can be seen throughout the year.","Common");
        creatureRepository.save(SnakelocksAnemone);

        Creature BurrowingAnemone = new Creature("Other Invertebrate","Burrowing Anemone","BurrowingAnemone.jpeg","Up to 5cm","Found in sandy substrates throughout the year.","Common");
        creatureRepository.save(BurrowingAnemone);



        //Jellyfish

        Creature LionsMane = new Creature("Jellyfish","Lions Mane", "LionsMane.jpeg", "Up to 50cm across", "Found of all UK coasts in summer months.","Common, nasty sting.");
        creatureRepository.save(LionsMane);

        Creature Moon = new Creature("Jellyfish","Moon", "MoonJellyfish.jpeg", "5 - 40cm", "Found throughout the world's oceans, the most common jellyfish in UK seas.","Common, it does not sting humans.");
        creatureRepository.save(Moon);

        Creature Barrel = new Creature("Jellyfish","Barrel", "BarrelJellyfish.jpeg", "Up to 90cm across", "Best seen May to October in warmer coastal waters, sometimes in their hundreds.","Common, their sting is not usually harmful to humans.");
        creatureRepository.save(Barrel);

        Creature Comb = new Creature("Jellyfish","", "CombJellyfish.jpeg", "A few mm up to 1.5m long", "Actually made up of a group called 'Ctenophores', found in coastal and oceanic waters worldwide.","Common");
        creatureRepository.save(Comb);


        //Starfish & Urchins

        Creature CommonStarfish = new Creature("Starfish & Urchins","CommonStarfish", "CommonStarfish.jpeg", "10 - 30cm", "Highly common in UK seas and rock pools.","Common");
        creatureRepository.save(CommonStarfish);

        Creature Sunstar= new Creature("Starfish & Urchins","Sunstar", "Sunstar.jpeg", "Up to 35cm", "Lives on the seabed in shallow waters, small Sunstars are sometimes found in rock pools.","Common");
        creatureRepository.save(Sunstar);

        Creature CommonUrchin = new Creature("Starfish & Urchins","Common Urchin", "CommonUrchin.jpeg", "", "","Common, edible.");
        creatureRepository.save(CommonUrchin);

        Creature SpinyStarfish = new Creature("Starfish & Urchins","Spiny Starfish", "SpinyStarfish.jpeg", "Up to 70cm diameter", "The UK's largest starfish! Shallow waters close to the shore, and depths of up to 200m.","Common");
        creatureRepository.save(SpinyStarfish);

        //Plants & Algae

        Creature Kelp = new Creature("Plants & Algae", "Kelp","Kelp.jpeg", "Up to 5m length", "Grows attached to rocky seabeds.","Common");
        creatureRepository.save(Kelp);

        Creature Seagrass = new Creature("Plants & Algae", "Seagrass","Seagrass.jpeg", "Varies - can form large 'sea meadows'.", "Found around the UK coast in sheltered areas such as harbours, estuaries, lagoons and bays.","Threatened");
        creatureRepository.save(Seagrass);

        Creature BladderWrack = new Creature("Plants & Algae", "Bladder Wrack","BladderWrack.jpeg", "", "","");
        creatureRepository.save(BladderWrack);

        Creature Maerl = new Creature("Plants & Algae", "Maerl","Maerl.jpeg", "7cm diameter", "Abundant on Scotland's west coast, found in sand, mud or gravel where sheltered from waves. Depths of 1 - 30m.","Common");
        creatureRepository.save(Maerl);




        // Arran - Beaches

        Beach ClauchlandsFarm = new Beach ("Arran", "Arran_ClauchlandsFarm.png", "Clauchlands Farm", "OS Explorer 361, NS048326", "///watched.violin.mammoths", "Lamlash (1.2 miles)", "This site, which is within the No Take Zone, offers the opportunity to see a marine habitat where no fishing has taken place since 2008. Look for juvenile fish and a wide variety of crabs and starfish amongst the seaweed. You may also find some patches of seagrass to explore by swimming along for a short 3 while with the coast on your right-hand side.");
        beachRepository.save(ClauchlandsFarm);

        Beach Lamlash  = new Beach ("Arran", "Arran_Lamlash.png", "Lamlash", "OS Explorer 361, NS030314", "///myth.uplifting.flux", "Lamlash(0 miles)", "The beach below the Drift Inn offers carefully-footed access to this excellent site, where a myriad of marine life lives. More advanced snorkelers can head slightly further out towards the buoys to try and find small patches of seagrass. There is a working pier near this site, so keep a safe distance from the jetty and be careful of boat traffic.");
        beachRepository.save(Lamlash);

        Beach WhitingBay = new Beach ("Arran", "Arran_WhitingBay.png", "Whiting Bay", " OS Explorer 361, NS045261", "///from.almost.overlooks", "Whiting Bay (0 miles)", "The old jetty at  Whiting Bay offers an ideal place for snorkeling; with easy access across a sandy beach there is lots to see making it a fantastic place for beginners and younger snorkelers. For the more experienced, head further out on a low tide towards the mooring buoys to find amazing seagrass habitat.");
        beachRepository.save(WhitingBay);

        Beach Kildonan = new Beach ("Arran", "Arran_Kildonan.png", "Kildonan", " OS Explorer 361, NS021209", "///squirts.dined.faced", "Kildonan (0 miles)", "This sheltered beach at the southern end of Arran is easily accessed from in front of the village hall. The geology offers impressive rocky outcrops, providing great habitat for fish and crustaceans. Seabirds, seals and otters are commonly seen here. The small beach at the front of the hall is great for beginners, more experienced may choose to explore the rocky outcrops.");
        beachRepository.save(Kildonan);

        Beach Imachar = new Beach ("Arran", "Arran_Imachar.png", "Imachar", "OS Explorer 361, NR865401", "///loans.describes.starred", "Pinmill (2.6 miles)", "This rocky outcrop is surrounded by beautifully clear waters, providing an excellent opportunity to see a variety of fish, crabs, starfish and many other species. Entry is safest directly off the pebble beach either side of the outcrop. Snorkeling this site an hour either side of high tide is recommended, and advanced snorkelers may benefit from taking a torch to explore between the rocks.");
        beachRepository.save(Imachar);

        Beach Lochranza = new Beach ("Arran", "Arran_Lochranza.png", "Lochranza", "OS Explorer 361, NR925509", "///hilltop.processor.touchy", "Lochranza (0 miles)", "To the west of the ferry pier, this sheltered beach offers an easily accessible site to snorkel whilst waiting for the ferry. Crabs, juvenile fish, starfish and a variety of sea snails can often be found hiding amongst the seaweed. Please ensure you stay close to the coast and remain well away from the working ferry pier.");
        beachRepository.save(Lochranza);



        //Arran - Clauchlands Farm - CreatureBeaches - Fish

        CreatureBeach ClauchlandsFarmBallanWrasse = new CreatureBeach(BallanWrasse, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmBallanWrasse);

        CreatureBeach ClauchlandsFarmCommonBlenny = new CreatureBeach(CommonBlenny, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmCommonBlenny);

        CreatureBeach ClauchlandsFarmTwoSpotGoby = new CreatureBeach(TwoSpotGoby, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmTwoSpotGoby);

        CreatureBeach ClauchlandsFarmJuvenileCod = new CreatureBeach(JuvenileCod, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmJuvenileCod);


        //Arran - Clauchlands Farm - CreatureBeaches - Crustaceans

        CreatureBeach ClauchlandsFarmShoreCrab = new CreatureBeach(ShoreCrab, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmShoreCrab);

        CreatureBeach ClauchlandsFarmHarbourCrab = new CreatureBeach(HarbourCrab, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmHarbourCrab);

        CreatureBeach ClauchlandsFarmVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmVelvetSwimmingCrab);

        CreatureBeach ClauchlandsFarmHermitCrab = new CreatureBeach(HermitCrab, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmHermitCrab);


    }
}
