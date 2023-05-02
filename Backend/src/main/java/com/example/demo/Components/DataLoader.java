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

        //Arran - Clauchlands Farm - CreatureBeaches - Snails

        CreatureBeach ClauchlandsFarmDogwhelk = new CreatureBeach(Dogwhelk, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmDogwhelk);

        CreatureBeach ClauchlandsFarmLimpet = new CreatureBeach(Limpet, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmLimpet);

        CreatureBeach ClauchlandsFarmPeriwinkle = new CreatureBeach(Periwinkle, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmPeriwinkle);

        CreatureBeach ClauchlandsFarmTopshell = new CreatureBeach(Topshell, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmTopshell);

        //Arran - Clauchlands Farm - CreatureBeaches - Other Invertebrtes

        CreatureBeach ClauchlandsFarmPeacockWorm = new CreatureBeach(PeacockWorm, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmPeacockWorm);

        CreatureBeach ClauchlandsFarmBeadletAnemone = new CreatureBeach(BeadletAnemone, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmBeadletAnemone);

        CreatureBeach ClauchlandsFarmSnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmSnakelocksAnemone);

        CreatureBeach ClauchlandsFarmBurrowingAnemone = new CreatureBeach(BurrowingAnemone, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmBurrowingAnemone);

        //Arran - Clauchlands Farm - CreatureBeaches - Jellyfish

        CreatureBeach ClauchlandsFarmLionsMane = new CreatureBeach(LionsMane, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmLionsMane);

        CreatureBeach ClauchlandsFarmMoon = new CreatureBeach(Moon, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmMoon);

        CreatureBeach ClauchlandsFarmBarrel = new CreatureBeach(Barrel, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmBarrel);

        CreatureBeach ClauchlandsFarmComb = new CreatureBeach(Comb, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmComb);

        //Arran - Clauchlands Farm - CreatureBeaches - Starfish & Urchins

        CreatureBeach ClauchlandsFarmCommonStarfish = new CreatureBeach(CommonStarfish, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmCommonStarfish);

        CreatureBeach ClauchlandsFarmSunstar = new CreatureBeach(Sunstar, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmSunstar);

        CreatureBeach ClauchlandsFarmCommonUrchin = new CreatureBeach(CommonUrchin, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmCommonUrchin);

        CreatureBeach ClauchlandsFarmSpinyStarfish = new CreatureBeach(SpinyStarfish, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmSpinyStarfish);

        //Arran - Clauchlands Farm - CreatureBeaches - Plants & Algae

        CreatureBeach ClauchlandsFarmKelp = new CreatureBeach(Kelp, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmKelp);

        CreatureBeach ClauchlandsFarmSeagrass = new CreatureBeach(Seagrass, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmSeagrass);

        CreatureBeach ClauchlandsFarmBladderWrack = new CreatureBeach(BladderWrack, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmBladderWrack);

        CreatureBeach ClauchlandsFarmMaerl = new CreatureBeach(Maerl, ClauchlandsFarm);
        creatureBeachRepository.save(ClauchlandsFarmMaerl);

        //Arran - Clauchlands Farm - CreatureBeaches - Other





        //Arran - Lamlash - CreatureBeaches - Fish

        CreatureBeach LamlashBallanWrasse = new CreatureBeach(BallanWrasse, Lamlash);
        creatureBeachRepository.save(LamlashBallanWrasse);

        CreatureBeach LamlashCommonBlenny = new CreatureBeach(CommonBlenny, Lamlash);
        creatureBeachRepository.save(LamlashCommonBlenny);

        CreatureBeach LamlashTwoSpotGoby = new CreatureBeach(TwoSpotGoby, Lamlash);
        creatureBeachRepository.save(LamlashTwoSpotGoby);

        CreatureBeach LamlashJuvenileCod = new CreatureBeach(JuvenileCod, Lamlash);
        creatureBeachRepository.save(LamlashJuvenileCod);

        //Arran - Lamlash - CreatureBeaches - Crustaceans

        CreatureBeach LamlashShoreCrab = new CreatureBeach(ShoreCrab, Lamlash);
        creatureBeachRepository.save(LamlashShoreCrab);

        CreatureBeach LamlashHarbourCrab = new CreatureBeach(HarbourCrab, Lamlash);
        creatureBeachRepository.save(LamlashHarbourCrab);

        CreatureBeach LamlashVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, Lamlash);
        creatureBeachRepository.save(LamlashVelvetSwimmingCrab);

        CreatureBeach LamlashHermitCrab = new CreatureBeach(HermitCrab, Lamlash);
        creatureBeachRepository.save(LamlashHermitCrab);

        //Arran - Lamlash - CreatureBeaches - Snails

        CreatureBeach LamlashDogwhelk = new CreatureBeach(Dogwhelk, Lamlash);
        creatureBeachRepository.save(LamlashDogwhelk);

        CreatureBeach LamlashLimpet = new CreatureBeach(Limpet, Lamlash);
        creatureBeachRepository.save(LamlashLimpet);

        CreatureBeach LamlashPeriwinkle = new CreatureBeach(Periwinkle, Lamlash);
        creatureBeachRepository.save(LamlashPeriwinkle);

        CreatureBeach LamlashTopshell = new CreatureBeach(Topshell, Lamlash);
        creatureBeachRepository.save(LamlashTopshell);

        //Arran - Lamlash - CreatureBeaches - Other Invertebrtes

        CreatureBeach LamlashPeacockWorm = new CreatureBeach(PeacockWorm, Lamlash);
        creatureBeachRepository.save(LamlashPeacockWorm);

        CreatureBeach LamlashBeadletAnemone = new CreatureBeach(BeadletAnemone, Lamlash);
        creatureBeachRepository.save(LamlashBeadletAnemone);

        CreatureBeach LamlashSnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, Lamlash);
        creatureBeachRepository.save(LamlashSnakelocksAnemone);

        CreatureBeach LamlashBurrowingAnemone = new CreatureBeach(BurrowingAnemone, Lamlash);
        creatureBeachRepository.save(LamlashBurrowingAnemone);

        //Arran - Lamlash - CreatureBeaches - Jellyfish

        CreatureBeach LamlashLionsMane = new CreatureBeach(LionsMane, Lamlash);
        creatureBeachRepository.save(LamlashLionsMane);

        CreatureBeach LamlashMoon = new CreatureBeach(Moon, Lamlash);
        creatureBeachRepository.save(LamlashMoon);

        CreatureBeach LamlashBarrel = new CreatureBeach(Barrel, Lamlash);
        creatureBeachRepository.save(LamlashBarrel);

        CreatureBeach LamlashComb = new CreatureBeach(Comb, Lamlash);
        creatureBeachRepository.save(LamlashComb);

        //Arran - Lamlash - CreatureBeaches - Starfish & Urchins

        CreatureBeach LamlashCommonStarfish = new CreatureBeach(CommonStarfish, Lamlash);
        creatureBeachRepository.save(LamlashCommonStarfish);

        CreatureBeach LamlashSunstar = new CreatureBeach(Sunstar, Lamlash);
        creatureBeachRepository.save(LamlashSunstar);

        CreatureBeach LamlashCommonUrchin = new CreatureBeach(CommonUrchin, Lamlash);
        creatureBeachRepository.save(LamlashCommonUrchin);

        CreatureBeach LamlashSpinyStarfish = new CreatureBeach(SpinyStarfish, Lamlash);
        creatureBeachRepository.save(LamlashSpinyStarfish);

        //Arran - Lamlash - CreatureBeaches - Plants & Algae

        CreatureBeach LamlashKelp = new CreatureBeach(Kelp, Lamlash);
        creatureBeachRepository.save(LamlashKelp);

        CreatureBeach LamlashSeagrass = new CreatureBeach(Seagrass, Lamlash);
        creatureBeachRepository.save(LamlashSeagrass);

        CreatureBeach LamlashBladderWrack = new CreatureBeach(BladderWrack, Lamlash);
        creatureBeachRepository.save(LamlashBladderWrack);

        CreatureBeach LamlashMaerl = new CreatureBeach(Maerl, Lamlash);
        creatureBeachRepository.save(LamlashMaerl);

        //Arran - Lamlash - CreatureBeaches - Other





        //Arran - WhitingBay - CreatureBeaches - Fish

        CreatureBeach WhitingBayBallanWrasse = new CreatureBeach(BallanWrasse, WhitingBay);
        creatureBeachRepository.save(WhitingBayBallanWrasse);

        CreatureBeach WhitingBayCommonBlenny = new CreatureBeach(CommonBlenny, WhitingBay);
        creatureBeachRepository.save(WhitingBayCommonBlenny);

        CreatureBeach WhitingBayTwoSpotGoby = new CreatureBeach(TwoSpotGoby, WhitingBay);
        creatureBeachRepository.save(WhitingBayTwoSpotGoby);

        CreatureBeach WhitingBayJuvenileCod = new CreatureBeach(JuvenileCod, WhitingBay);
        creatureBeachRepository.save(WhitingBayJuvenileCod);

        //Arran - WhitingBay - CreatureBeaches - Crustaceans

        CreatureBeach WhitingBayShoreCrab = new CreatureBeach(ShoreCrab, WhitingBay);
        creatureBeachRepository.save(WhitingBayShoreCrab);

        CreatureBeach WhitingBayHarbourCrab = new CreatureBeach(HarbourCrab, WhitingBay);
        creatureBeachRepository.save(WhitingBayHarbourCrab);

        CreatureBeach WhitingBayVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, WhitingBay);
        creatureBeachRepository.save(WhitingBayVelvetSwimmingCrab);

        CreatureBeach WhitingBayHermitCrab = new CreatureBeach(HermitCrab, WhitingBay);
        creatureBeachRepository.save(WhitingBayHermitCrab);

        //Arran - WhitingBay - CreatureBeaches - Snails
        CreatureBeach WhitingBayDogwhelk = new CreatureBeach(Dogwhelk, WhitingBay);
        creatureBeachRepository.save(WhitingBayDogwhelk);

        CreatureBeach WhitingBayLimpet = new CreatureBeach(Limpet, WhitingBay);
        creatureBeachRepository.save(WhitingBayLimpet);

        CreatureBeach WhitingBayPeriwinkle = new CreatureBeach(Periwinkle, WhitingBay);
        creatureBeachRepository.save(WhitingBayPeriwinkle);

        CreatureBeach WhitingBayTopshell = new CreatureBeach(Topshell, WhitingBay);
        creatureBeachRepository.save(WhitingBayTopshell);

        //Arran - WhitingBay - CreatureBeaches - Other Invertebrtes

        CreatureBeach WhitingBayPeacockWorm = new CreatureBeach(PeacockWorm, WhitingBay);
        creatureBeachRepository.save(WhitingBayPeacockWorm);

        CreatureBeach WhitingBayBeadletAnemone = new CreatureBeach(BeadletAnemone, WhitingBay);
        creatureBeachRepository.save(WhitingBayBeadletAnemone);

        CreatureBeach WhitingBaySnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, WhitingBay);
        creatureBeachRepository.save(WhitingBaySnakelocksAnemone);

        CreatureBeach WhitingBayBurrowingAnemone = new CreatureBeach(BurrowingAnemone, WhitingBay);
        creatureBeachRepository.save(WhitingBayBurrowingAnemone);

        //Arran - WhitingBay - CreatureBeaches - Jellyfish

        CreatureBeach WhitingBayLionsMane = new CreatureBeach(LionsMane, WhitingBay);
        creatureBeachRepository.save(WhitingBayLionsMane);

        CreatureBeach WhitingBayMoon = new CreatureBeach(Moon, WhitingBay);
        creatureBeachRepository.save(WhitingBayMoon);

        CreatureBeach WhitingBayBarrel = new CreatureBeach(Barrel, WhitingBay);
        creatureBeachRepository.save(WhitingBayBarrel);

        CreatureBeach WhitingBayComb = new CreatureBeach(Comb, WhitingBay);
        creatureBeachRepository.save(WhitingBayComb);

        //Arran - WhitingBay - CreatureBeaches - Starfish & Urchins

        CreatureBeach WhitingBayCommonStarfish = new CreatureBeach(CommonStarfish, WhitingBay);
        creatureBeachRepository.save(WhitingBayCommonStarfish);

        CreatureBeach WhitingBaySunstar = new CreatureBeach(Sunstar, WhitingBay);
        creatureBeachRepository.save(WhitingBaySunstar);

        CreatureBeach WhitingBayCommonUrchin = new CreatureBeach(CommonUrchin, WhitingBay);
        creatureBeachRepository.save(LamlashCommonUrchin);

        CreatureBeach WhitingBaySpinyStarfish = new CreatureBeach(SpinyStarfish, WhitingBay);
        creatureBeachRepository.save(LamlashSpinyStarfish);

        //Arran - WhitingBay - CreatureBeaches - Plants & Algae

        CreatureBeach WhitingBayKelp = new CreatureBeach(Kelp, WhitingBay);
        creatureBeachRepository.save(WhitingBayKelp);

        CreatureBeach WhitingBaySeagrass = new CreatureBeach(Seagrass, WhitingBay);
        creatureBeachRepository.save(WhitingBaySeagrass);

        CreatureBeach WhitingBayBladderWrack = new CreatureBeach(BladderWrack, WhitingBay);
        creatureBeachRepository.save(WhitingBayBladderWrack);

        CreatureBeach WhitingBayMaerl = new CreatureBeach(Maerl, WhitingBay);
        creatureBeachRepository.save(WhitingBayMaerl);

        //Arran - WhitingBay - CreatureBeaches - Other





    }
}
