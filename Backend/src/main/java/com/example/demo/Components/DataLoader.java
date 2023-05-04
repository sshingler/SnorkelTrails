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

        Creature Butterfish = new Creature("Fish","Butterfish","Butterfish.jpeg","Up to 25cm","A common sight in rockpools all around the UK throughout the year.","Common");
        creatureRepository.save(Butterfish);

        Creature LeopardSpottedGoby = new Creature("Fish","Leopard-Spotted Goby","LesserSpottedGoby.jpeg","About 12cm long","Widespread around UK coasts, sheltered estuaries and sea lochs. Usually found close to steep rock faces.","Common");
        creatureRepository.save(LeopardSpottedGoby);

        Creature Scorpionfish = new Creature("Fish","Scorpionfish","Scorpionfish.jpeg","Up to 20cm","Inhabits shallow coastal waters, bottom dwelling. It is capable of mimicking the colours of its surrounding environment which can make it difficult to spot.","Common");
        creatureRepository.save(Scorpionfish);

        Creature WeaverFish = new Creature( "Fish","Weever Fish","WeaverFish.jpeg","Up to 15cm long","Some of the only venomous fish in UK waters, they spend most of their lives buried in the sand but are often seen from June - October.","Common");
        creatureRepository.save(WeaverFish);




        //Crustacean
        Creature ShoreCrab = new Creature("Crustacean", "Shore Crab", "ShoreCrab.jpeg", "Up to 9cm shell width", "Easily found in rock pools and shallow waters throughout the year.", "Common");
        creatureRepository.save(ShoreCrab);

        Creature HarbourCrab = new Creature("Crustacean", "Harbour Crab", "HarbourCrab.jpeg", "Up to 5cm shell width", "Found on all UK coasts throughout the year, usually on the lower shore on fine, muddy sand or gravel.", "Common");
        creatureRepository.save(HarbourCrab);

        Creature VelvetSwimmingCrab = new Creature("Crustacean", "Velvet Swimming Crab", "VelvetSwimmingCrab.jpeg", "Up to 10cm shell width", "Found on all UK coasts throughout the year, often in rock pools.", "Common - notoriously feisty and can give a painful nip!");
        creatureRepository.save(VelvetSwimmingCrab);

        Creature HermitCrab = new Creature("Crustacean", "Hermit Crab", "HermitCrab.jpeg", "Up to 3.5cm length", "These crabs live in empty seashells, found on rocky shores throughout the year.", "Common");
        creatureRepository.save(HermitCrab);

        Creature EdibleCrab = new Creature("Crustacean","Edible Crab","EdibleCrab.jpeg","Width between 10 - 20cm ","Found on the lower shore and out to sea to about 100m. Often hidden under boulders. They can be seen throughout the year.","Common");
        creatureRepository.save(EdibleCrab);

        Creature SquatLobster = new Creature("Crustacean","Squat Lobster","SquatLobster.jpeg","Up to 6cm long","Usually seen April - October, the 'Houdinis' of the rocky shore, darting off as soon as disturbed.","Common");
        creatureRepository.save(SquatLobster);


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

        Creature Cuttlefish = new Creature("Other Invertebrate","Cuttlefish","Cuttlefish.jpeg","Up to 45cm","Fierce predators, they live in water up to 200m deep, but come to shallow waters to breed in spring.","Common");
        creatureRepository.save(Cuttlefish);

        Creature SeaHare = new Creature("Other Invertebrate","Sea Hare","SeaHare.jpeg","Length 7 - 20cm","Found in shallow water and occasionally in rockpools on the low shore through the year.","Common");
        creatureRepository.save(SeaHare);

        Creature DeadMansFingers = new Creature("Other Invertebrate","Dead Man's Fingers","DeadMansFingers.jpeg","Up to 20cm height","A type of soft coral, growing on hard surfaces beneath the sea down to about 50m. They can cover large areas of rocky outcrops and gullies.","Common");
        creatureRepository.save(DeadMansFingers);



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

        Creature Brittlestar = new Creature("Starfish & Urchins","Brittlestar","Brittlestar.jpeg","Up to 2cm","Found in rockpools around much of the UK throughout the year. Be gentle - its arms are very brittle and will break off if disturbed.","Common");
        creatureRepository.save(Brittlestar);

        Creature BloodyHenryStarfish = new Creature( "Starfish & Urchins","Bloody Henry Starfish","BloodyHenryStarfish.jpeg","10cm diameter","Sometimes found in rockpools at very low tides, usually on the seabed to depths of over 100m.","Common");
        creatureRepository.save(BloodyHenryStarfish);

        //Plants & Algae

        Creature Kelp = new Creature("Plants & Algae", "Kelp","Kelp.jpeg", "Up to 5m length", "Grows attached to rocky seabeds.","Common");
        creatureRepository.save(Kelp);

        Creature Seagrass = new Creature("Plants & Algae", "Seagrass","Seagrass.jpeg", "Varies - can form large 'sea meadows'", "Found around the UK coast in sheltered areas such as harbours, estuaries, lagoons and bays.","Threatened");
        creatureRepository.save(Seagrass);

        Creature BladderWrack = new Creature("Plants & Algae", "Bladder Wrack","BladderWrack.jpeg", "15-100cm length", "The seaweed most associated with the sea shore! Grows between high and low water marks on rocky shores.","Common");
        creatureRepository.save(BladderWrack);

        Creature Maerl = new Creature("Plants & Algae", "Maerl","Maerl.jpeg", "7cm diameter", "Abundant on Scotland's west coast, found in sand, mud or gravel where sheltered from waves. Depths of 1 - 30m.","Common");
        creatureRepository.save(Maerl);

        Creature ChannelWrack = new Creature("Plants & Algae","Channel Wrack","ChannelWrack.jpeg","5 - 15cm length","A very common seaweed growing around the high water mark on sheltered, rocky shores.","Common");
        creatureRepository.save(ChannelWrack);

        Creature SeaLettuce = new Creature("Plants & Algae","Sea Lettuce","SeaLettuce.jpeg","Up to 20cm length","Unmistakable and found on all UK coasts - most often bright green and always translucent.","Common");
        creatureRepository.save(SeaLettuce);

        //Seabird

        Creature Eider = new Creature( "Seabird","Eider","Eider.jpeg","55-60cm length, 94cm wingspan","Large sea ducks that nest in colonies around the coast of northern UK","Amber status under the Birds of Conservation Concern");
        creatureRepository.save(Eider);

        Creature ArcticTern = new Creature( "Seabird","Arctic Tern","ArcticTern.jpeg","33-35cm length, 75-85cm wingspan","Nests in colonies on sand and shingle beaches along the coast.","Amber status under the Birds of Conservation Concern");
        creatureRepository.save(ArcticTern);

        Creature Gannet = new Creature( "Seabird","Gannet","Gannets.jpeg","87-100cm length, 165-180cm wingspan","One of our largest seabirds. Nests on coastal cliffs, easily identified due to its size and distinctive markings.","Amber status under the Birds of Conservation Concern");
        creatureRepository.save(Gannet);

        Creature Shag = new Creature( "Seabird","Shag","Shag.jpeg","72-80cm length, 90-105cm wingspan","Nests on cliffs, but rarely seen inland. Often spotted perched on a rock or bank with their wings held out.","Red status under the Birds of Conservation Concern");
        creatureRepository.save(Shag);

        //Other





        //Beaches

        // Arran - Beaches

        List<String> amenitiesClauchlandsFarm = Arrays.asList("Parking");
        Beach ClauchlandsFarm = new Beach ("Arran", "Arran_ClauchlandsFarm.png", "Clauchlands Farm", "OS Explorer 361, NS048326", "///watched.violin.mammoths","55.547933, -5.0958", "Lamlash", "This site, which is within the No Take Zone, offers the opportunity to see a marine habitat where no fishing has taken place since 2008. Look for juvenile fish and a wide variety of crabs and starfish amongst the seaweed. You may also find some patches of seagrass to explore by swimming along for a short 3 while with the coast on your right-hand side.", amenitiesClauchlandsFarm);
        beachRepository.save(ClauchlandsFarm);

        List<String> amenitiesLamlash = Arrays.asList("Parking", "Toilet");
        Beach Lamlash  = new Beach ("Arran", "Arran_Lamlash.png", "Lamlash", "OS Explorer 361, NS030314", "///myth.uplifting.flux", "55.536425, -5.123452", "Lamlash", "The beach below the Drift Inn offers carefully-footed access to this excellent site, where a myriad of marine life lives. More advanced snorkelers can head slightly further out towards the buoys to try and find small patches of seagrass. There is a working pier near this site, so keep a safe distance from the jetty and be careful of boat traffic.", amenitiesLamlash);
        beachRepository.save(Lamlash);

        List<String> amenitiesWhitingBay = Arrays.asList("Parking", "Toilet", "Shop", "Cafe");
        Beach WhitingBay = new Beach ("Arran", "Arran_WhitingBay.png", "Whiting Bay", " OS Explorer 361, NS045261", "///from.almost.overlooks", "55.489476, -5.095962", "Whiting Bay", "The old jetty at  Whiting Bay offers an ideal place for snorkeling; with easy access across a sandy beach there is lots to see making it a fantastic place for beginners and younger snorkelers. For the more experienced, head further out on a low tide towards the mooring buoys to find amazing seagrass habitat.", amenitiesWhitingBay);
        beachRepository.save(WhitingBay);

        List<String> amenitiesKildonan = Arrays.asList("Parking", "Toilet");
        Beach Kildonan = new Beach ("Arran", "Arran_Kildonan.png", "Kildonan", " OS Explorer 361, NS021209", "///squirts.dined.faced","55.441853, -5.130202", "Kildonan", "This sheltered beach at the southern end of Arran is easily accessed from in front of the village hall. The geology offers impressive rocky outcrops, providing great habitat for fish and crustaceans. Seabirds, seals and otters are commonly seen here. The small beach at the front of the hall is great for beginners, more experienced may choose to explore the rocky outcrops.", amenitiesKildonan);
        beachRepository.save(Kildonan);

        List<String> amenitiesImachar = Arrays.asList("Parking", "Campsite");
        Beach Imachar = new Beach ("Arran", "Arran_Imachar.png", "Imachar", "OS Explorer 361, NR865401", "///loans.describes.starred","55.607522, -5.391156", "Pinmill", "This rocky outcrop is surrounded by beautifully clear waters, providing an excellent opportunity to see a variety of fish, crabs, starfish and many other species. Entry is safest directly off the pebble beach either side of the outcrop. Snorkeling this site an hour either side of high tide is recommended, and advanced snorkelers may benefit from taking a torch to explore between the rocks.", amenitiesImachar);
        beachRepository.save(Imachar);

        List<String> amenitiesLochranza = Arrays.asList("Parking", "Campsite", "Cafe");
        Beach Lochranza = new Beach ("Arran", "Arran_Lochranza.png", "Lochranza", "OS Explorer 361, NR925509", "///hilltop.processor.touchy","55.706999, -5.304224", "Lochranza", "To the west of the ferry pier, this sheltered beach offers an easily accessible site to snorkel whilst waiting for the ferry. Crabs, juvenile fish, starfish and a variety of sea snails can often be found hiding amongst the seaweed. Please ensure you stay close to the coast and remain well away from the working ferry pier.", amenitiesLochranza);
        beachRepository.save(Lochranza);

        //Berwickshire - Beaches

        List<String> amenitiesStarneyBay = Arrays.asList("Parking", "Shop", "Cafe", "Steps");
        Beach StarneyBay  = new Beach("Berwickshire","Berwickshire_StarneyBay.png","Starney Bay","OS Landranger 67, NT916677","///unfocused.shed.unpacked","55.902342,-2.135898","St Abbs","Part of National Trust for Scotland’s St Abbs Head Nature Reserve, this beautiful beach is accessed by the steps down from the coastal path. Rich kelp beds and rocky reefs in the bay are home to colourful ballan wrasse, leopard-spotted gobies and an array of anemone species. The easier central section is perfect for beginners, whilst the rocky outcrops offer more advanced snorkeling", amenitiesStarneyBay);
        beachRepository.save(StarneyBay);

        List<String> amenitiesColdinghamBay = Arrays.asList("Parking", "Shop", "Cafe", "Toilet");
        Beach ColdinghamBay = new Beach("Berwickshire","Berwickshire_ColdinghamBay.png","Coldingham Bay","OS Landranger 67, NT917665","///exotic.voting.spend","55.891562,-2.134262","Coldingham","An easily accessible beach perfect for a family day out. The central sandy section is a great spot for first time snorkeling. For more experienced snorkelers, the rocky shores fringing the bay team with life, from seaweed, anemones and urchins to butterfish, gobies and scorpionfish", amenitiesColdinghamBay);
        beachRepository.save(ColdinghamBay);

        List<String> amenitiesMilldownBay = Arrays.asList("Parking", "Cafe", "Toilet");
        Beach MilldownBay = new Beach("Berwickshire","Berwickshire_MilldownBay.png","Milldown Bay","OS Landranger 67, NT919662","///asked.bloomers.push","55.888866,-2.131086","Coldingham","To the south of Coldingham Bay, this smaller and more secluded shingle bay is accessed along the coastal path and offers more fantastic snorkeling opportunities. Cracks and crevices in the rocks provide homes for urchins, anemones and edible crabs, whilst kelp beds provide shelter for juvenile fish including saithe, butterfish and scorpionfish. An advanced site due to its relative remoteness", amenitiesMilldownBay);
        beachRepository.save(MilldownBay);

        List<String> amenitiesWeaselLoch = Arrays.asList("Parking", "Steps");
        Beach WeaselLoch = new Beach("Berwickshire","Berwickshire_WeaselLoch.png","Weasel Loch","OS Landranger 67, NT939650","///washroom.traders.cookers","55.878113,-2.099091","Eyemouth","This sheltered bay offers advanced snorkelers the chance to explore a range of habitats. Velvet swimming crabs and two-spotted gobies frequent the kelp forests, sea hares feed amongst the red seaweed, and cuttlefish hover above the sandy bottom. Access is via the steep wooden steps that descend from the car park of the Eyemouth Holiday Park. Please note that a parking charge applies.", amenitiesWeaselLoch);
        beachRepository.save(WeaselLoch);

        List<String> amenitiesEyemouthBeach = Arrays.asList("Parking", "Camping", "Shop", "Toilet", "Cafe");
        Beach EyemouthBeach = new Beach("Berwickshire","Berwickshire_EyemouthBeach.png","Eyemouth Beach","OS Landranger 67, NT943645","///marbles.enjoys.professes","55.873639,-2.092681","Eyemouth","Eyemouth’s easily accessible beach is perfect for first-time snorkelers, with a gradual walk into the sea to spot your first fish. Rockier outcrops to the north offer advanced snorkelers the chance to spot crabs and squat lobsters in the submerged rock pools, and seaweed gives shelter for many fish species. The Eyemouth Leisure Centre provides changing and showering facilities for a small fee.", amenitiesEyemouthBeach);
        beachRepository.save(EyemouthBeach);

        //East-Lothian - Beaches

        List<String> amenitiesGullaneBents = Arrays.asList("Parking", "Shop", "Toilet", "Cafe");
        Beach GullaneBents = new Beach("East-Lothian","East-Lothian_GullaneBents.png","Gullane Bents","OS Explorer 361, NT476832","///storm.cassettes.informer","56.038796,-2.842568","Gullane","This popular stretch of sandy coast is perfect for a family day out. From the car park, head down the sandy track and through the sand dunes to reach the beach. Here, you’ll find a mix of sandy beach, boulders and rocky reef; a perfect area for beginners. Toilets and showering facilities can be found a short walk away from the car park (vehicle height restrictions and parking charges apply).", amenitiesGullaneBents);
        beachRepository.save (GullaneBents);

        List<String> amenitiesYellowcraig = Arrays.asList("Parking", "Toilet");
        Beach Yellowcraig = new Beach("East-Lothian","East-Lothian_Yellowcraig.png","Yellowcraig","OS Explorer 361, NT514859","///guesswork.guests.trump","56.063457,-2.782083","Dirleton","Fidra, the island said to have inspired Robert Louis Stevenson’s book, Treasure Island, is a fantastic backdrop for this beautiful site. Access is a short walk from the car park along a sandy path through sand dunes. The central sandy area is a great spot for first time snorkeling, whilst more experienced snorkelers can head to the rocky areas west of the bay. Toilets and changing facilities are situated next to the car park (parking charges apply).", amenitiesYellowcraig);
        beachRepository.save (Yellowcraig);

        List<String> amenitiesScottishSeabirdCentre = Arrays.asList("Parking", "Toilet", "Shop", "Cafe", "Wheelchair");
        Beach ScottishSeabirdCentre = new Beach("East-Lothian","East-Lothian_ScottishSeabirdCentre.png","Scottish Seabird Centre","OS Explorer 361, NT554855","///also.interacts.torso","56.06025,-2.717772","North Berwick","This popular beach next to the Scottish Seabird Centre is accessible by ramp, providing a fantastic opportunity for beginners to find species such as hermit crabs and snails around North Berwick’s Boating Pond. More experienced snorkelers can search in gullies to the north and east of the centre.Visit the Centre’s shop and cafe or head into town for more services.", amenitiesScottishSeabirdCentre);
        beachRepository.save (ScottishSeabirdCentre);

        List<String> amenitiesMilseyBay = Arrays.asList("Parking", "Toilet", "Shop", "Cafe", "Wheelchair");
        Beach MilseyBay = new Beach("East-Lothian","East-Lothian_MilseyBay.png","Milsey Bay","OS Explorer 361, NT567852","///outdoor.hello.burden","56.057689,-2.696867","North Berwick","At the quieter east end of Milsey Bay, a section just off the beach is perfect for beginners, whilst the deeper water and rocky outcrops near the cliff line offer more advanced snorkeling. Shore- side parking is available along Melbourne Road and parking areas along Tantallon Terrance. For public toilets, town car parks (charges apply) and other services, head to the town centre.", amenitiesMilseyBay);
        beachRepository.save (MilseyBay);

        List<String> amenitiesDunbar = Arrays.asList("Parking", "Toilet", "Shop", "Cafe", "Steps");
        Beach Dunbar = new Beach("East-Lothian","East-Lothian_Dunbar.png","Dunbar","OS Explorer 361, NT676791","///second.wash.teardrop","56.003733,-2.521099","Dunbar","This sheltered, rocky bay, overlooked by Dunbar Castle, is a haven for marine life amongst the kelp and rocky crevices. More experienced snorkelers can head towards deeper parts but be sure to keep away from the harbour entrance. Access is via steps descending from the coastal path, west of Dunbar Leisure Pool. Parking and public toilets are available. Be cautious of metal piles present from old pool infrastructure.", amenitiesDunbar);
        beachRepository.save (Dunbar);
















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
        creatureBeachRepository.save(WhitingBayCommonUrchin);

        CreatureBeach WhitingBaySpinyStarfish = new CreatureBeach(SpinyStarfish, WhitingBay);
        creatureBeachRepository.save(WhitingBaySpinyStarfish);

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





        //Arran - Kildonan - CreatureBeaches - Fish

        CreatureBeach KildonanBallanWrasse = new CreatureBeach(BallanWrasse, Kildonan);
        creatureBeachRepository.save(KildonanBallanWrasse);

        CreatureBeach KildonanCommonBlenny = new CreatureBeach(CommonBlenny, Kildonan);
        creatureBeachRepository.save(KildonanCommonBlenny);

        CreatureBeach KildonanTwoSpotGoby = new CreatureBeach(TwoSpotGoby, Kildonan);
        creatureBeachRepository.save(KildonanTwoSpotGoby);

        CreatureBeach KildonanJuvenileCod = new CreatureBeach(JuvenileCod, Kildonan);
        creatureBeachRepository.save(KildonanJuvenileCod);

        //Arran - Kildonan - CreatureBeaches - Crustaceans

        CreatureBeach KildonanShoreCrab = new CreatureBeach(ShoreCrab, Kildonan);
        creatureBeachRepository.save(KildonanShoreCrab);

        CreatureBeach KildonanHarbourCrab = new CreatureBeach(HarbourCrab, Kildonan);
        creatureBeachRepository.save(KildonanHarbourCrab);

        CreatureBeach KildonanVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, Kildonan);
        creatureBeachRepository.save(KildonanVelvetSwimmingCrab);

        CreatureBeach KildonanHermitCrab = new CreatureBeach(HermitCrab, Kildonan);
        creatureBeachRepository.save(KildonanHermitCrab);

        //Arran - Kildonan - CreatureBeaches - Snails
        CreatureBeach KildonanDogwhelk = new CreatureBeach(Dogwhelk, Kildonan);
        creatureBeachRepository.save(KildonanDogwhelk);

        CreatureBeach KildonanLimpet = new CreatureBeach(Limpet, Kildonan);
        creatureBeachRepository.save(KildonanLimpet);

        CreatureBeach KildonanPeriwinkle = new CreatureBeach(Periwinkle, Kildonan);
        creatureBeachRepository.save(KildonanPeriwinkle);

        CreatureBeach KildonanTopshell = new CreatureBeach(Topshell, Kildonan);
        creatureBeachRepository.save(KildonanTopshell);

        //Arran - Kildonan - CreatureBeaches - Other Invertebrtes

        CreatureBeach KildonanPeacockWorm = new CreatureBeach(PeacockWorm, Kildonan);
        creatureBeachRepository.save(KildonanPeacockWorm);

        CreatureBeach KildonanBeadletAnemone = new CreatureBeach(BeadletAnemone, Kildonan);
        creatureBeachRepository.save(KildonanBeadletAnemone);

        CreatureBeach KildonanSnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, Kildonan);
        creatureBeachRepository.save(KildonanSnakelocksAnemone);

        CreatureBeach KildonanBurrowingAnemone = new CreatureBeach(BurrowingAnemone, Kildonan);
        creatureBeachRepository.save(KildonanBurrowingAnemone);

        //Arran - Kildonan - CreatureBeaches - Jellyfish

        CreatureBeach KildonanLionsMane = new CreatureBeach(LionsMane, Kildonan);
        creatureBeachRepository.save(KildonanLionsMane);

        CreatureBeach KildonanMoon = new CreatureBeach(Moon, Kildonan);
        creatureBeachRepository.save(KildonanMoon);

        CreatureBeach KildonanBarrel = new CreatureBeach(Barrel, Kildonan);
        creatureBeachRepository.save(KildonanBarrel);

        CreatureBeach KildonanComb = new CreatureBeach(Comb, Kildonan);
        creatureBeachRepository.save(KildonanComb);

        //Arran - Kildonan - CreatureBeaches - Starfish & Urchins

        CreatureBeach KildonanCommonStarfish = new CreatureBeach(CommonStarfish, Kildonan);
        creatureBeachRepository.save(KildonanCommonStarfish);

        CreatureBeach KildonanSunstar = new CreatureBeach(Sunstar, Kildonan);
        creatureBeachRepository.save(KildonanSunstar);

        CreatureBeach KildonanCommonUrchin = new CreatureBeach(CommonUrchin, Kildonan);
        creatureBeachRepository.save(KildonanCommonUrchin);

        CreatureBeach KildonanSpinyStarfish = new CreatureBeach(SpinyStarfish, Kildonan);
        creatureBeachRepository.save(KildonanSpinyStarfish);

        //Arran - Kildonan - CreatureBeaches - Plants & Algae

        CreatureBeach KildonanKelp = new CreatureBeach(Kelp, Kildonan);
        creatureBeachRepository.save(KildonanKelp);

        CreatureBeach KildonanSeagrass = new CreatureBeach(Seagrass, Kildonan);
        creatureBeachRepository.save(KildonanSeagrass);

        CreatureBeach KildonanBladderWrack = new CreatureBeach(BladderWrack, Kildonan);
        creatureBeachRepository.save(KildonanBladderWrack);

        CreatureBeach KildonanMaerl = new CreatureBeach(Maerl, Kildonan);
        creatureBeachRepository.save(KildonanMaerl);

        //Arran - Kildonan - CreatureBeaches - Other





        //Arran - Imachar - CreatureBeaches - Fish

        CreatureBeach ImacharBallanWrasse = new CreatureBeach(BallanWrasse, Imachar);
        creatureBeachRepository.save(KildonanBallanWrasse);

        CreatureBeach ImacharCommonBlenny = new CreatureBeach(CommonBlenny, Imachar);
        creatureBeachRepository.save(ImacharCommonBlenny);

        CreatureBeach ImacharTwoSpotGoby = new CreatureBeach(TwoSpotGoby, Imachar);
        creatureBeachRepository.save(ImacharTwoSpotGoby);

        CreatureBeach ImacharJuvenileCod = new CreatureBeach(JuvenileCod, Imachar);
        creatureBeachRepository.save(ImacharJuvenileCod);

        //Arran - Imachar - CreatureBeaches - Crustaceans

        CreatureBeach ImacharShoreCrab = new CreatureBeach(ShoreCrab, Imachar);
        creatureBeachRepository.save(ImacharShoreCrab);

        CreatureBeach ImacharHarbourCrab = new CreatureBeach(HarbourCrab, Imachar);
        creatureBeachRepository.save(ImacharHarbourCrab);

        CreatureBeach ImacharVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, Imachar);
        creatureBeachRepository.save(ImacharVelvetSwimmingCrab);

        CreatureBeach ImacharHermitCrab = new CreatureBeach(HermitCrab, Imachar);
        creatureBeachRepository.save(ImacharHermitCrab);

        //Arran - Imachar - CreatureBeaches - Snails

        CreatureBeach ImacharDogwhelk = new CreatureBeach(Dogwhelk, Imachar);
        creatureBeachRepository.save(ImacharDogwhelk);

        CreatureBeach ImacharLimpet = new CreatureBeach(Limpet, Imachar);
        creatureBeachRepository.save(ImacharLimpet);

        CreatureBeach ImacharPeriwinkle = new CreatureBeach(Periwinkle, Imachar);
        creatureBeachRepository.save(ImacharPeriwinkle);

        CreatureBeach ImacharTopshell = new CreatureBeach(Topshell, Imachar);
        creatureBeachRepository.save(ImacharTopshell);

        //Arran - Imachar - CreatureBeaches - Other Invertebrtes

        CreatureBeach ImacharPeacockWorm = new CreatureBeach(PeacockWorm, Imachar);
        creatureBeachRepository.save(ImacharPeacockWorm);

        CreatureBeach ImacharBeadletAnemone = new CreatureBeach(BeadletAnemone, Imachar);
        creatureBeachRepository.save(ImacharBeadletAnemone);

        CreatureBeach ImacharSnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, Imachar);
        creatureBeachRepository.save(KildonanSnakelocksAnemone);

        CreatureBeach ImacharBurrowingAnemone = new CreatureBeach(BurrowingAnemone, Imachar);
        creatureBeachRepository.save(ImacharBurrowingAnemone);

        //Arran - Imachar - CreatureBeaches - Jellyfish

        CreatureBeach ImacharLionsMane = new CreatureBeach(LionsMane, Imachar);
        creatureBeachRepository.save(ImacharLionsMane);

        CreatureBeach ImacharMoon = new CreatureBeach(Moon, Imachar);
        creatureBeachRepository.save(ImacharMoon);

        CreatureBeach ImacharBarrel = new CreatureBeach(Barrel, Imachar);
        creatureBeachRepository.save(ImacharBarrel);

        CreatureBeach ImacharComb = new CreatureBeach(Comb, Imachar);
        creatureBeachRepository.save(ImacharComb);

        //Arran - Imachar - CreatureBeaches - Starfish & Urchins

        CreatureBeach ImacharCommonStarfish = new CreatureBeach(CommonStarfish, Imachar);
        creatureBeachRepository.save(ImacharCommonStarfish);

        CreatureBeach ImacharSunstar = new CreatureBeach(Sunstar, Imachar);
        creatureBeachRepository.save(ImacharSunstar);

        CreatureBeach ImacharCommonUrchin = new CreatureBeach(CommonUrchin, Imachar);
        creatureBeachRepository.save(ImacharCommonUrchin);

        CreatureBeach ImacharSpinyStarfish = new CreatureBeach(SpinyStarfish, Imachar);
        creatureBeachRepository.save(ImacharSpinyStarfish);

        //Arran - Imachar - CreatureBeaches - Plants & Algae

        CreatureBeach ImacharKelp = new CreatureBeach(Kelp, Imachar);
        creatureBeachRepository.save(ImacharKelp);

        CreatureBeach ImacharSeagrass = new CreatureBeach(Seagrass, Imachar);
        creatureBeachRepository.save(ImacharSeagrass);

        CreatureBeach ImacharBladderWrack = new CreatureBeach(BladderWrack, Imachar);
        creatureBeachRepository.save(ImacharBladderWrack);

        CreatureBeach ImacharMaerl = new CreatureBeach(Maerl, Imachar);
        creatureBeachRepository.save(ImacharMaerl);

        //Arran - Imachar - CreatureBeaches - Other





        //Arran - Imachar - CreatureBeaches - Fish

        CreatureBeach LochranzaBallanWrasse = new CreatureBeach(BallanWrasse, Lochranza);
        creatureBeachRepository.save(LochranzaBallanWrasse);

        CreatureBeach LochranzaCommonBlenny = new CreatureBeach(CommonBlenny, Lochranza);
        creatureBeachRepository.save(LochranzaCommonBlenny);

        CreatureBeach LochranzaTwoSpotGoby = new CreatureBeach(TwoSpotGoby, Lochranza);
        creatureBeachRepository.save(LochranzaTwoSpotGoby);

        CreatureBeach LochranzaJuvenileCod = new CreatureBeach(JuvenileCod, Lochranza);
        creatureBeachRepository.save(LochranzaJuvenileCod);

        //Arran - Lochranza - CreatureBeaches - Crustaceans

        CreatureBeach LochranzaShoreCrab = new CreatureBeach(ShoreCrab, Lochranza);
        creatureBeachRepository.save(LochranzaShoreCrab);

        CreatureBeach LochranzaHarbourCrab = new CreatureBeach(HarbourCrab, Lochranza);
        creatureBeachRepository.save(LochranzaHarbourCrab);

        CreatureBeach LochranzaVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, Lochranza);
        creatureBeachRepository.save(LochranzaVelvetSwimmingCrab);

        CreatureBeach LochranzaHermitCrab = new CreatureBeach(HermitCrab, Lochranza);
        creatureBeachRepository.save(LochranzaHermitCrab);

        //Arran - Lochranza - CreatureBeaches - Snails

        CreatureBeach LochranzaDogwhelk = new CreatureBeach(Dogwhelk, Lochranza);
        creatureBeachRepository.save(LochranzaDogwhelk);

        CreatureBeach LochranzaLimpet = new CreatureBeach(Limpet, Lochranza);
        creatureBeachRepository.save(LochranzaLimpet);

        CreatureBeach LochranzaPeriwinkle = new CreatureBeach(Periwinkle, Lochranza);
        creatureBeachRepository.save(LochranzaPeriwinkle);

        CreatureBeach LochranzaTopshell = new CreatureBeach(Topshell, Lochranza);
        creatureBeachRepository.save(LochranzaTopshell);

        //Arran - Lochranza - CreatureBeaches - Other Invertebrtes

        CreatureBeach LochranzaPeacockWorm = new CreatureBeach(PeacockWorm, Lochranza);
        creatureBeachRepository.save(LochranzaPeacockWorm);

        CreatureBeach LochranzaBeadletAnemone = new CreatureBeach(BeadletAnemone, Lochranza);
        creatureBeachRepository.save(LochranzaBeadletAnemone);

        CreatureBeach LochranzaSnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, Lochranza);
        creatureBeachRepository.save(KildonanSnakelocksAnemone);

        CreatureBeach LochranzaBurrowingAnemone = new CreatureBeach(BurrowingAnemone, Lochranza);
        creatureBeachRepository.save(LochranzaBurrowingAnemone);

        //Arran - Lochranza - CreatureBeaches - Jellyfish

        CreatureBeach LochranzaLionsMane = new CreatureBeach(LionsMane, Lochranza);
        creatureBeachRepository.save(LochranzaLionsMane);

        CreatureBeach LochranzaMoon = new CreatureBeach(Moon, Lochranza);
        creatureBeachRepository.save(LochranzaMoon);

        CreatureBeach LochranzaBarrel = new CreatureBeach(Barrel, Lochranza);
        creatureBeachRepository.save(LochranzaBarrel);

        CreatureBeach LochranzaComb = new CreatureBeach(Comb, Lochranza);
        creatureBeachRepository.save(LochranzaComb);

        //Arran - Lochranza - CreatureBeaches - Starfish & Urchins

        CreatureBeach LochranzaCommonStarfish = new CreatureBeach(CommonStarfish, Lochranza);
        creatureBeachRepository.save(LochranzaCommonStarfish);

        CreatureBeach LochranzaSunstar = new CreatureBeach(Sunstar, Lochranza);
        creatureBeachRepository.save(LochranzaSunstar);

        CreatureBeach LochranzaCommonUrchin = new CreatureBeach(CommonUrchin, Lochranza);
        creatureBeachRepository.save(LochranzaCommonUrchin);

        CreatureBeach LochranzaSpinyStarfish = new CreatureBeach(SpinyStarfish, Lochranza);
        creatureBeachRepository.save(LochranzaSpinyStarfish);

        //Arran - Lochranza - CreatureBeaches - Plants & Algae

        CreatureBeach LochranzaKelp = new CreatureBeach(Kelp, Lochranza);
        creatureBeachRepository.save(LochranzaKelp);

        CreatureBeach LochranzaSeagrass = new CreatureBeach(Seagrass, Lochranza);
        creatureBeachRepository.save(LochranzaSeagrass);

        CreatureBeach LochranzaBladderWrack = new CreatureBeach(BladderWrack, Lochranza);
        creatureBeachRepository.save(LochranzaBladderWrack);

        CreatureBeach LochranzaMaerl = new CreatureBeach(Maerl, Lochranza);
        creatureBeachRepository.save(LochranzaMaerl);

        //Arran - Lochranza - CreatureBeaches - Other








        //Berwickshire - Starney Bay - CreatureBeaches - Fish

        CreatureBeach StarneyBayBallanWrasse = new CreatureBeach(BallanWrasse, StarneyBay);
        creatureBeachRepository.save(StarneyBayBallanWrasse);

        CreatureBeach StarneyBayButterfish = new CreatureBeach(Butterfish, StarneyBay);
        creatureBeachRepository.save(StarneyBayButterfish);

        CreatureBeach StarneyBayScorpionfish = new CreatureBeach(Scorpionfish, StarneyBay);
        creatureBeachRepository.save(StarneyBayScorpionfish);

        CreatureBeach StarneyBayLeopardSpottedGoby = new CreatureBeach(LeopardSpottedGoby, StarneyBay);
        creatureBeachRepository.save(StarneyBayLeopardSpottedGoby);

        //Berwickshire - Starney Bay - CreatureBeaches - Crustaceans

        CreatureBeach StarneyBayShoreCrab = new CreatureBeach(ShoreCrab, StarneyBay);
        creatureBeachRepository.save(StarneyBayShoreCrab);

        CreatureBeach StarneyBayVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, StarneyBay);
        creatureBeachRepository.save(StarneyBayVelvetSwimmingCrab);

        CreatureBeach StarneyBayEdibleCrab = new CreatureBeach(EdibleCrab, StarneyBay);
        creatureBeachRepository.save(StarneyBayEdibleCrab);

        CreatureBeach StarneyBaySquatLobster = new CreatureBeach(SquatLobster, StarneyBay);
        creatureBeachRepository.save(StarneyBaySquatLobster);

        //Berwickshire - Starney Bay - CreatureBeaches - Snails

        CreatureBeach StarneyBayTopshell = new CreatureBeach(Topshell, StarneyBay);
        creatureBeachRepository.save(StarneyBayTopshell);

        CreatureBeach StarneyBayDogwhelk = new CreatureBeach(Dogwhelk, StarneyBay);
        creatureBeachRepository.save(StarneyBayDogwhelk);

        CreatureBeach StarneyBayPeriwinkle = new CreatureBeach(Periwinkle, StarneyBay);
        creatureBeachRepository.save(StarneyBayPeriwinkle);

        CreatureBeach StarneyBayLimpet = new CreatureBeach(Limpet, StarneyBay);
        creatureBeachRepository.save(StarneyBayLimpet);

        //Berwickshire - Starney Bay - CreatureBeaches - Other Invertebrates

        CreatureBeach StarneyBaySnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, StarneyBay);
        creatureBeachRepository.save(StarneyBaySnakelocksAnemone);

        CreatureBeach StarneyBayCuttlefish = new CreatureBeach(Cuttlefish, StarneyBay);
        creatureBeachRepository.save(StarneyBayCuttlefish);

        CreatureBeach StarneyBaySeaHare = new CreatureBeach(SeaHare, StarneyBay);
        creatureBeachRepository.save(StarneyBaySeaHare);

        CreatureBeach StarneyBayDeadMansFingers = new CreatureBeach(DeadMansFingers, StarneyBay);
        creatureBeachRepository.save(StarneyBayDeadMansFingers);

        //Berwickshire - Starney Bay - CreatureBeaches - Jellyfish

        CreatureBeach StarneyBayLionsMane = new CreatureBeach(LionsMane, StarneyBay);
        creatureBeachRepository.save(StarneyBayLionsMane);

        CreatureBeach StarneyBayMoon = new CreatureBeach(Moon, StarneyBay);
        creatureBeachRepository.save(StarneyBayMoon);

        CreatureBeach StarneyBayBarrel = new CreatureBeach(Barrel, StarneyBay);
        creatureBeachRepository.save(StarneyBayBarrel);

        CreatureBeach StarneyBayComb = new CreatureBeach(Comb, StarneyBay);
        creatureBeachRepository.save(StarneyBayComb);

        //Berwickshire - Starney Bay - CreatureBeaches - Starfish & Urchins

        CreatureBeach StarneyBayCommonStarfish = new CreatureBeach(CommonStarfish, StarneyBay);
        creatureBeachRepository.save(StarneyBayCommonStarfish);

        CreatureBeach StarneyBayBrittlestar = new CreatureBeach(Brittlestar, StarneyBay);
        creatureBeachRepository.save(StarneyBayBrittlestar);

        CreatureBeach StarneyBaySunstar = new CreatureBeach(Sunstar, StarneyBay);
        creatureBeachRepository.save(StarneyBaySunstar);

        CreatureBeach StarneyBayCommonUrchin = new CreatureBeach(CommonUrchin, StarneyBay);
        creatureBeachRepository.save(StarneyBayCommonUrchin);

        //Berwickshire - Starney Bay - CreatureBeaches - Plants & Algae

        CreatureBeach StarneyBayKelp = new CreatureBeach(Kelp, StarneyBay);
        creatureBeachRepository.save(StarneyBayKelp);

        CreatureBeach StarneyBayBladderWrack = new CreatureBeach(BladderWrack, StarneyBay);
        creatureBeachRepository.save(StarneyBayBladderWrack);

        CreatureBeach StarneyBaySeaLettuce = new CreatureBeach(SeaLettuce, StarneyBay);
        creatureBeachRepository.save(StarneyBaySeaLettuce);

        CreatureBeach StarneyBayChannelWrack = new CreatureBeach(ChannelWrack, StarneyBay);
        creatureBeachRepository.save(StarneyBayChannelWrack);

        //Berwickshire - Starney Bay - CreatureBeaches - Others






        //Berwickshire - Coldingham Bay - CreatureBeaches - Fish

        CreatureBeach ColdinghamBayBallanWrasse = new CreatureBeach(BallanWrasse, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBayBallanWrasse);

        CreatureBeach ColdinghamBayButterfish = new CreatureBeach(Butterfish, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBayButterfish);

        CreatureBeach ColdinghamBayScorpionfish = new CreatureBeach(Scorpionfish, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBayScorpionfish);

        CreatureBeach ColdinghamBayLeopardSpottedGoby = new CreatureBeach(LeopardSpottedGoby, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBayLeopardSpottedGoby);

        //Berwickshire - Coldingham Bay - CreatureBeaches - Crustaceans

        CreatureBeach ColdinghamBayShoreCrab = new CreatureBeach(ShoreCrab, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBayShoreCrab);

        CreatureBeach ColdinghamBayVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBayVelvetSwimmingCrab);

        CreatureBeach ColdinghamBayEdibleCrab = new CreatureBeach(EdibleCrab, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBayEdibleCrab);

        CreatureBeach ColdinghamBaySquatLobster = new CreatureBeach(SquatLobster, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBaySquatLobster);

        //Berwickshire - Coldingham Bay - CreatureBeaches - Snails

        CreatureBeach ColdinghamBayTopshell = new CreatureBeach(Topshell, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBayTopshell);

        CreatureBeach ColdinghamBayDogwhelk = new CreatureBeach(Dogwhelk, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBayDogwhelk);

        CreatureBeach ColdinghamBayPeriwinkle = new CreatureBeach(Periwinkle, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBayPeriwinkle);

        CreatureBeach ColdinghamBayLimpet = new CreatureBeach(Limpet, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBayLimpet);

        //Berwickshire - Coldingham Bay - CreatureBeaches - Other Invertebrates

        CreatureBeach ColdinghamBaySnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBaySnakelocksAnemone);

        CreatureBeach ColdinghamBayCuttlefish = new CreatureBeach(Cuttlefish, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBayCuttlefish);

        CreatureBeach ColdinghamBaySeaHare = new CreatureBeach(SeaHare, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBaySeaHare);

        CreatureBeach ColdinghamBayDeadMansFingers = new CreatureBeach(DeadMansFingers, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBayDeadMansFingers);

        //Berwickshire - Coldingham Bay - CreatureBeaches - Jellyfish

        CreatureBeach ColdinghamBayLionsMane = new CreatureBeach(LionsMane, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBayLionsMane);

        CreatureBeach ColdinghamBayMoon = new CreatureBeach(Moon, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBayMoon);

        CreatureBeach ColdinghamBayBarrel = new CreatureBeach(Barrel, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBayBarrel);

        CreatureBeach ColdinghamBayComb = new CreatureBeach(Comb, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBayComb);

        //Berwickshire - Coldingham Bay - CreatureBeaches - Starfish & Urchins

        CreatureBeach ColdinghamBayCommonStarfish = new CreatureBeach(CommonStarfish, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBayCommonStarfish);

        CreatureBeach ColdinghamBayBrittlestar = new CreatureBeach(Brittlestar, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBayBrittlestar);

        CreatureBeach ColdinghamBaySunstar = new CreatureBeach(Sunstar, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBaySunstar);

        CreatureBeach ColdinghamBayCommonUrchin = new CreatureBeach(CommonUrchin, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBayCommonUrchin);

        //Berwickshire - Coldingham Bay - CreatureBeaches - Plants & Algae

        CreatureBeach ColdinghamBayKelp = new CreatureBeach(Kelp, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBayKelp);

        CreatureBeach ColdinghamBayBladderWrack = new CreatureBeach(BladderWrack, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBayBladderWrack);

        CreatureBeach ColdinghamBaySeaLettuce = new CreatureBeach(SeaLettuce, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBaySeaLettuce);

        CreatureBeach ColdinghamBayChannelWrack = new CreatureBeach(ChannelWrack, ColdinghamBay);
        creatureBeachRepository.save(ColdinghamBayChannelWrack);

        //Berwickshire - Coldingham Bay - CreatureBeaches - Others






        //Berwickshire - Milldown Bay - CreatureBeaches - Fish

        CreatureBeach MilldownBayBallanWrasse = new CreatureBeach(BallanWrasse, MilldownBay);
        creatureBeachRepository.save(MilldownBayBallanWrasse);

        CreatureBeach MilldownBayButterfish = new CreatureBeach(Butterfish, MilldownBay);
        creatureBeachRepository.save(MilldownBayButterfish);

        CreatureBeach MilldownBayScorpionfish = new CreatureBeach(Scorpionfish, MilldownBay);
        creatureBeachRepository.save(MilldownBayScorpionfish);

        CreatureBeach MilldownBayLeopardSpottedGoby = new CreatureBeach(LeopardSpottedGoby, MilldownBay);
        creatureBeachRepository.save(MilldownBayLeopardSpottedGoby);

        //Berwickshire - Milldown Bay - CreatureBeaches - Crustaceans

        CreatureBeach MilldownBayShoreCrab = new CreatureBeach(ShoreCrab, MilldownBay);
        creatureBeachRepository.save(MilldownBayShoreCrab);

        CreatureBeach MilldownBayVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, MilldownBay);
        creatureBeachRepository.save(MilldownBayVelvetSwimmingCrab);

        CreatureBeach MilldownBayEdibleCrab = new CreatureBeach(EdibleCrab, MilldownBay);
        creatureBeachRepository.save(MilldownBayEdibleCrab);

        CreatureBeach MilldownBaySquatLobster = new CreatureBeach(SquatLobster, MilldownBay);
        creatureBeachRepository.save(MilldownBaySquatLobster);

        //Berwickshire - Milldown Bay - CreatureBeaches - Snails

        CreatureBeach MilldownBayTopshell = new CreatureBeach(Topshell, MilldownBay);
        creatureBeachRepository.save(MilldownBayTopshell);

        CreatureBeach MilldownBayDogwhelk = new CreatureBeach(Dogwhelk, MilldownBay);
        creatureBeachRepository.save(MilldownBayDogwhelk);

        CreatureBeach MilldownBayPeriwinkle = new CreatureBeach(Periwinkle, MilldownBay);
        creatureBeachRepository.save(MilldownBayPeriwinkle);

        CreatureBeach MilldownBayLimpet = new CreatureBeach(Limpet, MilldownBay);
        creatureBeachRepository.save(MilldownBayLimpet);

        //Berwickshire - Milldown Bay - CreatureBeaches - Other Invertebrates

        CreatureBeach MilldownBaySnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, MilldownBay);
        creatureBeachRepository.save(MilldownBaySnakelocksAnemone);

        CreatureBeach MilldownBayCuttlefish = new CreatureBeach(Cuttlefish, MilldownBay);
        creatureBeachRepository.save(MilldownBayCuttlefish);

        CreatureBeach MilldownBaySeaHare = new CreatureBeach(SeaHare, MilldownBay);
        creatureBeachRepository.save(MilldownBaySeaHare);

        CreatureBeach MilldownBayDeadMansFingers = new CreatureBeach(DeadMansFingers, MilldownBay);
        creatureBeachRepository.save(MilldownBayDeadMansFingers);

        //Berwickshire - Milldown Bay - CreatureBeaches - Jellyfish

        CreatureBeach MilldownBayLionsMane = new CreatureBeach(LionsMane, MilldownBay);
        creatureBeachRepository.save(MilldownBayLionsMane);

        CreatureBeach MilldownBayMoon = new CreatureBeach(Moon, MilldownBay);
        creatureBeachRepository.save(MilldownBayMoon);

        CreatureBeach MilldownBayBarrel = new CreatureBeach(Barrel, MilldownBay);
        creatureBeachRepository.save(MilldownBayBarrel);

        CreatureBeach MilldownBayComb = new CreatureBeach(Comb, MilldownBay);
        creatureBeachRepository.save(MilldownBayComb);

        //Berwickshire - Milldown Bay - CreatureBeaches - Starfish & Urchins

        CreatureBeach MilldownBayCommonStarfish = new CreatureBeach(CommonStarfish, MilldownBay);
        creatureBeachRepository.save(MilldownBayCommonStarfish);

        CreatureBeach MilldownBayBrittlestar = new CreatureBeach(Brittlestar, MilldownBay);
        creatureBeachRepository.save(MilldownBayBrittlestar);

        CreatureBeach MilldownBaySunstar = new CreatureBeach(Sunstar, MilldownBay);
        creatureBeachRepository.save(MilldownBaySunstar);

        CreatureBeach MilldownBayCommonUrchin = new CreatureBeach(CommonUrchin, MilldownBay);
        creatureBeachRepository.save(MilldownBayCommonUrchin);

        //Berwickshire - Milldown Bay - CreatureBeaches - Plants & Algae

        CreatureBeach MilldownBayKelp = new CreatureBeach(Kelp, MilldownBay);
        creatureBeachRepository.save(MilldownBayKelp);

        CreatureBeach MilldownBayBladderWrack = new CreatureBeach(BladderWrack, MilldownBay);
        creatureBeachRepository.save(MilldownBayBladderWrack);

        CreatureBeach MilldownBaySeaLettuce = new CreatureBeach(SeaLettuce, MilldownBay);
        creatureBeachRepository.save(MilldownBaySeaLettuce);

        CreatureBeach MilldownBayChannelWrack = new CreatureBeach(ChannelWrack, MilldownBay);
        creatureBeachRepository.save(MilldownBayChannelWrack);

        //Berwickshire - Milldown Bay - CreatureBeaches - Others





        //Berwickshire - Weasel Loch - CreatureBeaches - Fish

        CreatureBeach WeaselLochBallanWrasse = new CreatureBeach(BallanWrasse, WeaselLoch);
        creatureBeachRepository.save(WeaselLochBallanWrasse);

        CreatureBeach WeaselLochButterfish = new CreatureBeach(Butterfish, WeaselLoch);
        creatureBeachRepository.save(WeaselLochButterfish);

        CreatureBeach WeaselLochScorpionfish = new CreatureBeach(Scorpionfish, WeaselLoch);
        creatureBeachRepository.save(WeaselLochScorpionfish);

        CreatureBeach WeaselLochLeopardSpottedGoby = new CreatureBeach(LeopardSpottedGoby, WeaselLoch);
        creatureBeachRepository.save(WeaselLochLeopardSpottedGoby);

        //Berwickshire - Weasel Loch - CreatureBeaches - Crustaceans

        CreatureBeach WeaselLochShoreCrab = new CreatureBeach(ShoreCrab, WeaselLoch);
        creatureBeachRepository.save(WeaselLochShoreCrab);

        CreatureBeach WeaselLochVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, WeaselLoch);
        creatureBeachRepository.save(WeaselLochVelvetSwimmingCrab);

        CreatureBeach WeaselLochEdibleCrab = new CreatureBeach(EdibleCrab, WeaselLoch);
        creatureBeachRepository.save(WeaselLochEdibleCrab);

        CreatureBeach WeaselLochSquatLobster = new CreatureBeach(SquatLobster, WeaselLoch);
        creatureBeachRepository.save(WeaselLochSquatLobster);

        //Berwickshire - Weasel Loch - CreatureBeaches - Snails

        CreatureBeach WeaselLochTopshell = new CreatureBeach(Topshell, WeaselLoch);
        creatureBeachRepository.save(WeaselLochTopshell);

        CreatureBeach WeaselLochDogwhelk = new CreatureBeach(Dogwhelk, WeaselLoch);
        creatureBeachRepository.save(WeaselLochDogwhelk);

        CreatureBeach WeaselLochPeriwinkle = new CreatureBeach(Periwinkle, WeaselLoch);
        creatureBeachRepository.save(WeaselLochPeriwinkle);

        CreatureBeach WeaselLochLimpet = new CreatureBeach(Limpet, WeaselLoch);
        creatureBeachRepository.save(WeaselLochLimpet);

        //Berwickshire - Weasel Loch - CreatureBeaches - Other Invertebrates

        CreatureBeach WeaselLochSnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, WeaselLoch);
        creatureBeachRepository.save(WeaselLochSnakelocksAnemone);

        CreatureBeach WeaselLochCuttlefish = new CreatureBeach(Cuttlefish, WeaselLoch);
        creatureBeachRepository.save(WeaselLochCuttlefish);

        CreatureBeach WeaselLochSeaHare = new CreatureBeach(SeaHare, WeaselLoch);
        creatureBeachRepository.save(WeaselLochSeaHare);

        CreatureBeach WeaselLochDeadMansFingers = new CreatureBeach(DeadMansFingers, WeaselLoch);
        creatureBeachRepository.save(WeaselLochDeadMansFingers);

        //Berwickshire - Weasel Loch - CreatureBeaches - Jellyfish

        CreatureBeach WeaselLochLionsMane = new CreatureBeach(LionsMane, WeaselLoch);
        creatureBeachRepository.save(WeaselLochLionsMane);

        CreatureBeach WeaselLochMoon = new CreatureBeach(Moon, WeaselLoch);
        creatureBeachRepository.save(WeaselLochMoon);

        CreatureBeach WeaselLochBarrel = new CreatureBeach(Barrel, WeaselLoch);
        creatureBeachRepository.save(WeaselLochBarrel);

        CreatureBeach WeaselLochComb = new CreatureBeach(Comb, WeaselLoch);
        creatureBeachRepository.save(WeaselLochComb);

        //Berwickshire - Weasel Loch - CreatureBeaches - Starfish & Urchins

        CreatureBeach WeaselLochCommonStarfish = new CreatureBeach(CommonStarfish, WeaselLoch);
        creatureBeachRepository.save(WeaselLochCommonStarfish);

        CreatureBeach WeaselLochBrittlestar = new CreatureBeach(Brittlestar, WeaselLoch);
        creatureBeachRepository.save(WeaselLochBrittlestar);

        CreatureBeach WeaselLochSunstar = new CreatureBeach(Sunstar, WeaselLoch);
        creatureBeachRepository.save(WeaselLochSunstar);

        CreatureBeach WeaselLochCommonUrchin = new CreatureBeach(CommonUrchin, WeaselLoch);
        creatureBeachRepository.save(WeaselLochCommonUrchin);

        //Berwickshire - Weasel Loch - CreatureBeaches - Plants & Algae

        CreatureBeach WeaselLochKelp = new CreatureBeach(Kelp, WeaselLoch);
        creatureBeachRepository.save(WeaselLochKelp);

        CreatureBeach WeaselLochBladderWrack = new CreatureBeach(BladderWrack, WeaselLoch);
        creatureBeachRepository.save(WeaselLochBladderWrack);

        CreatureBeach WeaselLochSeaLettuce = new CreatureBeach(SeaLettuce, WeaselLoch);
        creatureBeachRepository.save(WeaselLochSeaLettuce);

        CreatureBeach WeaselLochChannelWrack = new CreatureBeach(ChannelWrack, WeaselLoch);
        creatureBeachRepository.save(WeaselLochChannelWrack);

        //Berwickshire - Weasel Loch - CreatureBeaches - Others






        //Berwickshire - Eyemouth Beach - CreatureBeaches - Fish

        CreatureBeach EyemouthBeachBallanWrasse = new CreatureBeach(BallanWrasse, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachBallanWrasse);

        CreatureBeach EyemouthBeachButterfish = new CreatureBeach(Butterfish, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachButterfish);

        CreatureBeach EyemouthBeachScorpionfish = new CreatureBeach(Scorpionfish, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachScorpionfish);

        CreatureBeach EyemouthBeachLeopardSpottedGoby = new CreatureBeach(LeopardSpottedGoby, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachLeopardSpottedGoby);

        //Berwickshire - Eyemouth Beach - CreatureBeaches - Crustaceans

        CreatureBeach EyemouthBeachShoreCrab = new CreatureBeach(ShoreCrab, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachShoreCrab);

        CreatureBeach EyemouthBeachVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachVelvetSwimmingCrab);

        CreatureBeach EyemouthBeachEdibleCrab = new CreatureBeach(EdibleCrab, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachEdibleCrab);

        CreatureBeach EyemouthBeachSquatLobster = new CreatureBeach(SquatLobster, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachSquatLobster);

        //Berwickshire - Eyemouth Beach - CreatureBeaches - Snails

        CreatureBeach EyemouthBeachTopshell = new CreatureBeach(Topshell, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachTopshell);

        CreatureBeach EyemouthBeachDogwhelk = new CreatureBeach(Dogwhelk, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachDogwhelk);

        CreatureBeach EyemouthBeachPeriwinkle = new CreatureBeach(Periwinkle, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachPeriwinkle);

        CreatureBeach EyemouthBeachLimpet = new CreatureBeach(Limpet, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachLimpet);

        //Berwickshire - Eyemouth Beach - CreatureBeaches - Other Invertebrates

        CreatureBeach EyemouthBeachSnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachSnakelocksAnemone);

        CreatureBeach EyemouthBeachCuttlefish = new CreatureBeach(Cuttlefish, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachCuttlefish);

        CreatureBeach EyemouthBeachSeaHare = new CreatureBeach(SeaHare, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachSeaHare);

        CreatureBeach EyemouthBeachDeadMansFingers = new CreatureBeach(DeadMansFingers, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachDeadMansFingers);

        //Berwickshire - Eyemouth Beach - CreatureBeaches - Jellyfish

        CreatureBeach EyemouthBeachLionsMane = new CreatureBeach(LionsMane, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachLionsMane);

        CreatureBeach EyemouthBeachMoon = new CreatureBeach(Moon, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachMoon);

        CreatureBeach EyemouthBeachBarrel = new CreatureBeach(Barrel, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachBarrel);

        CreatureBeach EyemouthBeachComb = new CreatureBeach(Comb, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachComb);

        //Berwickshire - Eyemouth Beach - CreatureBeaches - Starfish & Urchins

        CreatureBeach EyemouthBeachCommonStarfish = new CreatureBeach(CommonStarfish, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachCommonStarfish);

        CreatureBeach EyemouthBeachBrittlestar = new CreatureBeach(Brittlestar, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachBrittlestar);

        CreatureBeach EyemouthBeachSunstar = new CreatureBeach(Sunstar, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachSunstar);

        CreatureBeach EyemouthBeachCommonUrchin = new CreatureBeach(CommonUrchin, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachCommonUrchin);

        //Berwickshire - Eyemouth Beach - CreatureBeaches - Plants & Algae

        CreatureBeach EyemouthBeachKelp = new CreatureBeach(Kelp, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachKelp);

        CreatureBeach EyemouthBeachBladderWrack = new CreatureBeach(BladderWrack, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachBladderWrack);

        CreatureBeach EyemouthBeachSeaLettuce = new CreatureBeach(SeaLettuce, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachSeaLettuce);

        CreatureBeach EyemouthBeachChannelWrack = new CreatureBeach(ChannelWrack, EyemouthBeach);
        creatureBeachRepository.save(EyemouthBeachChannelWrack);

        //Berwickshire - Eyemouth Beach - CreatureBeaches - Others






        //East-Lothian - Gullane Bents - CreatureBeaches - Fish

        CreatureBeach GullaneBentsBallanWrasse = new CreatureBeach(BallanWrasse, GullaneBents);
        creatureBeachRepository.save(GullaneBentsBallanWrasse);

        CreatureBeach GullaneBentsButterfish = new CreatureBeach(Butterfish, GullaneBents);
        creatureBeachRepository.save(GullaneBentsButterfish);

        CreatureBeach GullaneBentsScorpionfish = new CreatureBeach(Scorpionfish, GullaneBents);
        creatureBeachRepository.save(GullaneBentsScorpionfish);

        CreatureBeach GullaneBentsWeaverFish = new CreatureBeach(WeaverFish, GullaneBents);
        creatureBeachRepository.save(GullaneBentsWeaverFish);

        //East-Lothian - Gullane Bents - CreatureBeaches - Crustaceans

        CreatureBeach GullaneBentsShoreCrab = new CreatureBeach(ShoreCrab, GullaneBents);
        creatureBeachRepository.save(GullaneBentsShoreCrab);

        CreatureBeach GullaneBentsVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, GullaneBents);
        creatureBeachRepository.save(GullaneBentsVelvetSwimmingCrab);

        CreatureBeach GullaneBentsEdibleCrab = new CreatureBeach(EdibleCrab, GullaneBents);
        creatureBeachRepository.save(GullaneBentsEdibleCrab);

        CreatureBeach GullaneBentsHermitCrab = new CreatureBeach(HermitCrab, GullaneBents);
        creatureBeachRepository.save(GullaneBentsHermitCrab);

        //East-Lothian - Gullane Bents - CreatureBeaches - Snails

        CreatureBeach GullaneBentsTopshell = new CreatureBeach(Topshell, GullaneBents);
        creatureBeachRepository.save(GullaneBentsTopshell);

        CreatureBeach GullaneBentsDogwhelk = new CreatureBeach(Dogwhelk, GullaneBents);
        creatureBeachRepository.save(GullaneBentsDogwhelk);

        CreatureBeach GullaneBentsPeriwinkle = new CreatureBeach(Periwinkle, GullaneBents);
        creatureBeachRepository.save(GullaneBentsPeriwinkle);

        CreatureBeach GullaneBentsLimpet = new CreatureBeach(Limpet, GullaneBents);
        creatureBeachRepository.save(GullaneBentsLimpet);

        //East-Lothian - Gullane Bents - CreatureBeaches - Other Invertebrates

        CreatureBeach GullaneBentsCommonStarfish = new CreatureBeach(CommonStarfish, GullaneBents);
        creatureBeachRepository.save(GullaneBentsCommonStarfish);

        CreatureBeach GullaneBentsBrittlestar = new CreatureBeach(Brittlestar, GullaneBents);
        creatureBeachRepository.save(GullaneBentsBrittlestar);

        CreatureBeach GullaneBentsBloodyHenryStarfish = new CreatureBeach(BloodyHenryStarfish, GullaneBents);
        creatureBeachRepository.save(GullaneBentsBloodyHenryStarfish);

        CreatureBeach GullaneBentsDeadMansFingers = new CreatureBeach(DeadMansFingers, GullaneBents);
        creatureBeachRepository.save(GullaneBentsDeadMansFingers);

        //East-Lothian - Gullane Bents - CreatureBeaches - Seabirds

        CreatureBeach GullaneBentsEider = new CreatureBeach(Eider, GullaneBents);
        creatureBeachRepository.save(GullaneBentsEider);

        CreatureBeach GullaneBentsArcticTern = new CreatureBeach(ArcticTern, GullaneBents);
        creatureBeachRepository.save(GullaneBentsArcticTern);

        CreatureBeach GullaneBentsGannet = new CreatureBeach(Gannet, GullaneBents);
        creatureBeachRepository.save(GullaneBentsGannet);

        CreatureBeach GullaneBentsShag = new CreatureBeach(Shag, GullaneBents);
        creatureBeachRepository.save(GullaneBentsShag);

        //East-Lothian - Gullane Bents - CreatureBeaches - Jellyfish

        CreatureBeach GullaneBentsLionsMane = new CreatureBeach(LionsMane, GullaneBents);
        creatureBeachRepository.save(GullaneBentsLionsMane);

        CreatureBeach GullaneBentsMoon = new CreatureBeach(Moon, GullaneBents);
        creatureBeachRepository.save(GullaneBentsMoon);

        CreatureBeach GullaneBentsBarrel = new CreatureBeach(Barrel, GullaneBents);
        creatureBeachRepository.save(GullaneBentsBarrel);

        CreatureBeach GullaneBentsComb = new CreatureBeach(Comb, GullaneBents);
        creatureBeachRepository.save(GullaneBentsComb);

        //East-Lothian - Gullane Bents - CreatureBeaches - Algae

        CreatureBeach GullaneBentsBladderWrack = new CreatureBeach(BladderWrack, GullaneBents);
        creatureBeachRepository.save(GullaneBentsBladderWrack);

        CreatureBeach GullaneBentsKelp = new CreatureBeach(Kelp, GullaneBents);
        creatureBeachRepository.save(GullaneBentsKelp);

        CreatureBeach GullaneBentsSeaLettuce = new CreatureBeach(SeaLettuce, GullaneBents);
        creatureBeachRepository.save(GullaneBentsSeaLettuce);

        CreatureBeach GullaneBentsChannelWrack = new CreatureBeach(ChannelWrack, GullaneBents);
        creatureBeachRepository.save(GullaneBentsChannelWrack);

        //East-Lothian - Gullane Bents - CreatureBeaches - Others



















    }
}
