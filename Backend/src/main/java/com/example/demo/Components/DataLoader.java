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

        Creature LesserSpottedDogfish = new Creature( "Fish","Lesser-Spotted Dogfish","Lesser-SpottedDogfish.jpeg","Up to 75cm","Our most commonly seen shark, their egg cases (known as 'Mermaids purses') are often found washed up onshore.","Common");
        creatureRepository.save(LesserSpottedDogfish);

        Creature Sandeel = new Creature( "Fish","Sandeel","Sandeel.jpeg","Up to 20cm","Best seen between April - September, swimming in large shoals close to the seabed. They will burrow into the sand to escape predators.","Common, priority species");
        creatureRepository.save(Sandeel);

        Creature Pollock = new Creature( "Fish","Pollock","Pollock.jpeg","A few cm, up to 105cm when mature","Usually found sheltered close to the seabed, venturing into deeper waters as size increases.","Common");
        creatureRepository.save(Pollock);

        Creature GreaterPipeFish = new Creature( "Fish","Greater Pipe Fish","GreaterPipefish.jpeg","Up to 45cm long","The Pipefish lives amongst seaweed and seagrass, feeding on small prawns and shrimp.","Common");
        creatureRepository.save(GreaterPipeFish);

        Creature LongSpinedSeaScorpion = new Creature( "Fish","Long Spined Sea Scorpion","LongSpinedSeaScorpion.jpeg","Up to 20cm long","This species can adapt and blend in perfectly with surrounding algae and encrusting organisms. Usually seen April - October.","Common");
        creatureRepository.save(LongSpinedSeaScorpion);




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

        //Mollusc

        Creature BlueMussel = new Creature( "Mollusc","Blue Mussel","BlueMussel.jpeg","3-10cm","Rocky, sandy or muddy shores from the low tide mark.","Common");
        creatureRepository.save(BlueMussel);

        Creature QueenScallop = new Creature( "Mollusc","Queen Scallop","QueenScallop.jpeg","Up to 9cm diameter","Found between tidemarks to depths of around 100m, and on sand or gravel.","Common");
        creatureRepository.save(QueenScallop);

        Creature NativeOyster = new Creature( "Mollusc","Native Oyster","NativeOyster.jpeg","Up to 11cm","Live on the seabed in shallow coastal waters and estuaries, forming dense beds where conditions are favourable.","Priority species");
        creatureRepository.save(NativeOyster);


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

        Creature BreadcrumbSponge = new Creature( "Other Invertebrate","Breadcrumb Sponge","BreadcrumbSponge.jpeg","Up to 1m wide, normally in patches of 10 - 20cm","Found on rocky shores, rocky seabeds or cobbles beneath the low water mark. Lots of different colours and grows in a variety of shapes!","Common");
        creatureRepository.save(BreadcrumbSponge);

        Creature StrawberryAnemone = new Creature( "Other Invertebrate","Strawberry Anemone","StrawberryAnemone.jpeg","Up to 10cm diameter","Strawberry Anemones live attached to rocks on the lower shore.","Common");
        creatureRepository.save(StrawberryAnemone);

        Creature SerpulidWorm = new Creature( "Other Invertebrate","Serpulid Worm","SerpulidWorm.jpeg","5mm wide and up to 15cm long, joining together to form large reefs","Serpulid reefs grow at depths of 6 to 10m and form a high-rise home for many other organisms.","Priority species");
        creatureRepository.save(SerpulidWorm);



        //Jellyfish

        Creature LionsMane = new Creature("Jellyfish","Lions Mane", "LionsMane.jpeg", "Up to 50cm across", "Found of all UK coasts in summer months.","Common, nasty sting.");
        creatureRepository.save(LionsMane);

        Creature Moon = new Creature("Jellyfish","Moon", "MoonJellyfish.jpeg", "5 - 40cm", "Found throughout the world's oceans, the most common jellyfish in UK seas.","Common, it does not sting humans.");
        creatureRepository.save(Moon);

        Creature Barrel = new Creature("Jellyfish","Barrel", "BarrelJellyfish.jpeg", "Up to 90cm across", "Best seen May to October in warmer coastal waters, sometimes in their hundreds.","Common, their sting is not usually harmful to humans.");
        creatureRepository.save(Barrel);

        Creature Comb = new Creature("Jellyfish","Comb", "CombJellyfish.jpeg", "A few mm up to 1.5m long", "Actually made up of a group called 'Ctenophores', found in coastal and oceanic waters worldwide.","Common");
        creatureRepository.save(Comb);

        Creature Stalked = new Creature("Jellyfish","Stalked", "StalkedJellyfish.png", "Up to 4.5cm", "Lower shore and rocky coasts, sometimes found on macroalgae and seagrasses.","Rare. Global red list");
        creatureRepository.save(Stalked);


        //Starfish & Urchins

        Creature CommonStarfish = new Creature("Starfish & Urchins","CommonStarfish", "CommonStarfish.jpeg", "10 - 30cm", "Highly common in UK seas and rock pools.","Common");
        creatureRepository.save(CommonStarfish);

        Creature Sunstar= new Creature("Starfish & Urchins","Sunstar", "Sunstar.jpeg", "Up to 35cm", "Lives on the seabed in shallow waters, small Sunstars are sometimes found in rock pools.","Common");
        creatureRepository.save(Sunstar);

        Creature CommonUrchin = new Creature("Starfish & Urchins","Common Urchin", "CommonUrchin.jpeg", "Up to 15cm diameter", "Lives on the seabed down to 40m, occasionally found in rockpools on a very low tide.","Common, edible.");
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

        Creature Eelgrass = new Creature( "Plants & Algae","Eelgrass","Eelgrass.jpeg","Usually 20 - 50cm long","Found on the very low shore down to 10m deep, can form dense seagrass meadows and provide shelter for many species.","Threatened");
        creatureRepository.save(Eelgrass);



        //Seabird

        Creature Eider = new Creature( "Seabird","Eider","Eider.jpeg","55-60cm length, 94cm wingspan","Large sea ducks that nest in colonies around the coast of northern UK","Amber status under the Birds of Conservation Concern");
        creatureRepository.save(Eider);

        Creature ArcticTern = new Creature( "Seabird","Arctic Tern","ArcticTern.jpeg","33-35cm length, 75-85cm wingspan","Nests in colonies on sand and shingle beaches along the coast.","Amber status under the Birds of Conservation Concern");
        creatureRepository.save(ArcticTern);

        Creature Gannet = new Creature( "Seabird","Gannet","Gannets.jpeg","87-100cm length, 165-180cm wingspan","One of our largest seabirds. Nests on coastal cliffs, easily identified due to its size and distinctive markings.","Amber status under the Birds of Conservation Concern");
        creatureRepository.save(Gannet);

        Creature Shag = new Creature( "Seabird","Shag","Shag.jpeg","72-80cm length, 90-105cm wingspan","Nests on cliffs, but rarely seen inland. Often spotted perched on a rock or bank with their wings held out.","Red status under the Birds of Conservation Concern");
        creatureRepository.save(Shag);

        Creature WhiteTailedEagle = new Creature( "Seabird","White-Tailed Eagle","WhiteTailedEagle.jpeg","80-90cm length, 2.2m wingspan","Our largest bird of prey, sometimes known as the 'Sea-Eagle'. Their territory may be up to 70 square kilometres! ","Amber status under the Birds of Conservation Concern");
        creatureRepository.save(WhiteTailedEagle);

        //Other





        //Beaches

        // Arran - Beaches

        List<String> amenitiesClauchlandsFarm = Arrays.asList("Parking");
        Beach ClauchlandsFarm = new Beach ("Arran", "Arran_ClauchlandsFarm.png","Arran_ClauchlandsFarmBeach.jpeg", "Clauchlands Farm", "OS Explorer 361, NS048326", "///watched.violin.mammoths","55.547933, -5.0958", "Lamlash", "This site, which is within the No Take Zone, offers the opportunity to see a marine habitat where no fishing has taken place since 2008. Look for juvenile fish and a wide variety of crabs and starfish amongst the seaweed. You may also find some patches of seagrass to explore by swimming along for a short 3 while with the coast on your right-hand side.", amenitiesClauchlandsFarm);
        beachRepository.save(ClauchlandsFarm);

        List<String> amenitiesLamlash = Arrays.asList("Parking", "Toilet");
        Beach Lamlash  = new Beach ("Arran", "Arran_Lamlash.png", "Arran_LamlashBeach.jpeg","Lamlash", "OS Explorer 361, NS030314", "///myth.uplifting.flux", "55.536425, -5.123452", "Lamlash", "The beach below the Drift Inn offers carefully-footed access to this excellent site, where a myriad of marine life lives. More advanced snorkelers can head slightly further out towards the buoys to try and find small patches of seagrass. There is a working pier near this site, so keep a safe distance from the jetty and be careful of boat traffic.", amenitiesLamlash);
        beachRepository.save(Lamlash);

        List<String> amenitiesWhitingBay = Arrays.asList("Parking", "Toilet", "Shop", "Cafe");
        Beach WhitingBay = new Beach ("Arran", "Arran_WhitingBay.png", "Arran_WhitingBayBeach.jpeg","Whiting Bay", " OS Explorer 361, NS045261", "///from.almost.overlooks", "55.489476, -5.095962", "Whiting Bay", "The old jetty at  Whiting Bay offers an ideal place for snorkeling; with easy access across a sandy beach there is lots to see making it a fantastic place for beginners and younger snorkelers. For the more experienced, head further out on a low tide towards the mooring buoys to find amazing seagrass habitat.", amenitiesWhitingBay);
        beachRepository.save(WhitingBay);

        List<String> amenitiesKildonan = Arrays.asList("Parking", "Toilet");
        Beach Kildonan = new Beach ("Arran", "Arran_Kildonan.png","Arran_KildonanBeach.jpeg", "Kildonan", " OS Explorer 361, NS021209", "///squirts.dined.faced","55.441853, -5.130202", "Kildonan", "This sheltered beach at the southern end of Arran is easily accessed from in front of the village hall. The geology offers impressive rocky outcrops, providing great habitat for fish and crustaceans. Seabirds, seals and otters are commonly seen here. The small beach at the front of the hall is great for beginners, more experienced may choose to explore the rocky outcrops.", amenitiesKildonan);
        beachRepository.save(Kildonan);

        List<String> amenitiesImachar = Arrays.asList("Parking", "Campsite");
        Beach Imachar = new Beach ("Arran", "Arran_Imachar.png", "Arran_ImacharBeach.jpeg","Imachar", "OS Explorer 361, NR865401", "///loans.describes.starred","55.607522, -5.391156", "Pinmill", "This rocky outcrop is surrounded by beautifully clear waters, providing an excellent opportunity to see a variety of fish, crabs, starfish and many other species. Entry is safest directly off the pebble beach either side of the outcrop. Snorkeling this site an hour either side of high tide is recommended, and advanced snorkelers may benefit from taking a torch to explore between the rocks.", amenitiesImachar);
        beachRepository.save(Imachar);

        List<String> amenitiesLochranza = Arrays.asList("Parking", "Campsite", "Cafe");
        Beach Lochranza = new Beach ("Arran", "Arran_Lochranza.png","Arran_LochranzaBeach.jpeg", "Lochranza", "OS Explorer 361, NR925509", "///hilltop.processor.touchy","55.706999, -5.304224", "Lochranza", "To the west of the ferry pier, this sheltered beach offers an easily accessible site to snorkel whilst waiting for the ferry. Crabs, juvenile fish, starfish and a variety of sea snails can often be found hiding amongst the seaweed. Please ensure you stay close to the coast and remain well away from the working ferry pier.", amenitiesLochranza);
        beachRepository.save(Lochranza);

        //Berwickshire - Beaches

        List<String> amenitiesStarneyBay = Arrays.asList("Parking", "Shop", "Cafe", "Steps");
        Beach StarneyBay  = new Beach("Berwickshire","Berwickshire_StarneyBay.png","Berwickshire_StarneyBayBeach.jpeg","Starney Bay","OS Landranger 67, NT916677","///unfocused.shed.unpacked","55.902342,-2.135898","St Abbs","Part of National Trust for Scotland’s St Abbs Head Nature Reserve, this beautiful beach is accessed by the steps down from the coastal path. Rich kelp beds and rocky reefs in the bay are home to colourful ballan wrasse, leopard-spotted gobies and an array of anemone species. The easier central section is perfect for beginners, whilst the rocky outcrops offer more advanced snorkeling", amenitiesStarneyBay);
        beachRepository.save(StarneyBay);

        List<String> amenitiesColdinghamBay = Arrays.asList("Parking", "Shop", "Cafe", "Toilet");
        Beach ColdinghamBay = new Beach("Berwickshire","Berwickshire_ColdinghamBay.png","Berwickshire_ColdinghamBayBeach.jpeg", "Coldingham Bay","OS Landranger 67, NT917665","///exotic.voting.spend","55.891562,-2.134262","Coldingham","An easily accessible beach perfect for a family day out. The central sandy section is a great spot for first time snorkeling. For more experienced snorkelers, the rocky shores fringing the bay team with life, from seaweed, anemones and urchins to butterfish, gobies and scorpionfish", amenitiesColdinghamBay);
        beachRepository.save(ColdinghamBay);

        List<String> amenitiesMilldownBay = Arrays.asList("Parking", "Cafe", "Toilet");
        Beach MilldownBay = new Beach("Berwickshire","Berwickshire_MilldownBay.png","Berwickshire_MilldownBayBeach.jpeg","Milldown Bay","OS Landranger 67, NT919662","///asked.bloomers.push","55.888866,-2.131086","Coldingham","To the south of Coldingham Bay, this smaller and more secluded shingle bay is accessed along the coastal path and offers more fantastic snorkeling opportunities. Cracks and crevices in the rocks provide homes for urchins, anemones and edible crabs, whilst kelp beds provide shelter for juvenile fish including saithe, butterfish and scorpionfish. An advanced site due to its relative remoteness", amenitiesMilldownBay);
        beachRepository.save(MilldownBay);

        List<String> amenitiesWeaselLoch = Arrays.asList("Parking", "Steps");
        Beach WeaselLoch = new Beach("Berwickshire","Berwickshire_WeaselLoch.png","Berwickshire_WeaselLochBeach.jpeg","Weasel Loch","OS Landranger 67, NT939650","///washroom.traders.cookers","55.878113,-2.099091","Eyemouth","This sheltered bay offers advanced snorkelers the chance to explore a range of habitats. Velvet swimming crabs and two-spotted gobies frequent the kelp forests, sea hares feed amongst the red seaweed, and cuttlefish hover above the sandy bottom. Access is via the steep wooden steps that descend from the car park of the Eyemouth Holiday Park. Please note that a parking charge applies.", amenitiesWeaselLoch);
        beachRepository.save(WeaselLoch);

        List<String> amenitiesEyemouthBeach = Arrays.asList("Parking", "Camping", "Shop", "Toilet", "Cafe");
        Beach EyemouthBeach = new Beach("Berwickshire","Berwickshire_EyemouthBeach.png","Berwickshire_EyemouthBeachBeach.jpeg","Eyemouth Beach","OS Landranger 67, NT943645","///marbles.enjoys.professes","55.873639,-2.092681","Eyemouth","Eyemouth’s easily accessible beach is perfect for first-time snorkelers, with a gradual walk into the sea to spot your first fish. Rockier outcrops to the north offer advanced snorkelers the chance to spot crabs and squat lobsters in the submerged rock pools, and seaweed gives shelter for many fish species. The Eyemouth Leisure Centre provides changing and showering facilities for a small fee.", amenitiesEyemouthBeach);
        beachRepository.save(EyemouthBeach);

        //East-Lothian - Beaches

        List<String> amenitiesGullaneBents = Arrays.asList("Parking", "Shop", "Toilet", "Cafe");
        Beach GullaneBents = new Beach("East-Lothian","East-Lothian_GullaneBents.png","East-Lothian_GullaneBentsBeach.jpeg","Gullane Bents","OS Explorer 361, NT476832","///storm.cassettes.informer","56.038796,-2.842568","Gullane","This popular stretch of sandy coast is perfect for a family day out. From the car park, head down the sandy track and through the sand dunes to reach the beach. Here, you’ll find a mix of sandy beach, boulders and rocky reef; a perfect area for beginners. Toilets and showering facilities can be found a short walk away from the car park (vehicle height restrictions and parking charges apply).", amenitiesGullaneBents);
        beachRepository.save (GullaneBents);

        List<String> amenitiesYellowcraig = Arrays.asList("Parking", "Toilet");
        Beach Yellowcraig = new Beach("East-Lothian","East-Lothian_Yellowcraig.png","East-Lothian_YellowcraigBeach.jpeg","Yellowcraig","OS Explorer 361, NT514859","///guesswork.guests.trump","56.063457,-2.782083","Dirleton","Fidra, the island said to have inspired Robert Louis Stevenson’s book, Treasure Island, is a fantastic backdrop for this beautiful site. Access is a short walk from the car park along a sandy path through sand dunes. The central sandy area is a great spot for first time snorkeling, whilst more experienced snorkelers can head to the rocky areas west of the bay. Toilets and changing facilities are situated next to the car park (parking charges apply).", amenitiesYellowcraig);
        beachRepository.save (Yellowcraig);

        List<String> amenitiesScottishSeabirdCentre = Arrays.asList("Parking", "Toilet", "Shop", "Cafe", "Wheelchair");
        Beach ScottishSeabirdCentre = new Beach("East-Lothian","East-Lothian_ScottishSeabirdCentre.png","East-Lothian_ScottishSeabirdCentreBeach.jpeg","Scottish Seabird Centre","OS Explorer 361, NT554855","///also.interacts.torso","56.06025,-2.717772","North Berwick","This popular beach next to the Scottish Seabird Centre is accessible by ramp, providing a fantastic opportunity for beginners to find species such as hermit crabs and snails around North Berwick’s Boating Pond. More experienced snorkelers can search in gullies to the north and east of the centre.Visit the Centre’s shop and cafe or head into town for more services.", amenitiesScottishSeabirdCentre);
        beachRepository.save (ScottishSeabirdCentre);

        List<String> amenitiesMilseyBay = Arrays.asList("Parking", "Toilet", "Shop", "Cafe", "Wheelchair");
        Beach MilseyBay = new Beach("East-Lothian","East-Lothian_MilseyBay.png","East-Lothian_MilseyBayBeach.jpeg","Milsey Bay","OS Explorer 361, NT567852","///outdoor.hello.burden","56.057689,-2.696867","North Berwick","At the quieter east end of Milsey Bay, a section just off the beach is perfect for beginners, whilst the deeper water and rocky outcrops near the cliff line offer more advanced snorkeling. Shore- side parking is available along Melbourne Road and parking areas along Tantallon Terrance. For public toilets, town car parks (charges apply) and other services, head to the town centre.", amenitiesMilseyBay);
        beachRepository.save (MilseyBay);

        List<String> amenitiesDunbar = Arrays.asList("Parking", "Toilet", "Shop", "Cafe", "Steps");
        Beach Dunbar = new Beach("East-Lothian","East-Lothian_Dunbar.png","East-Lothian_DunbarBeach.jpeg","Dunbar","OS Explorer 361, NT676791","///second.wash.teardrop","56.003733,-2.521099","Dunbar","This sheltered, rocky bay, overlooked by Dunbar Castle, is a haven for marine life amongst the kelp and rocky crevices. More experienced snorkelers can head towards deeper parts but be sure to keep away from the harbour entrance. Access is via steps descending from the coastal path, west of Dunbar Leisure Pool. Parking and public toilets are available. Be cautious of metal piles present from old pool infrastructure.", amenitiesDunbar);
        beachRepository.save (Dunbar);

        //Lochaber - Beaches

        List<String> amenitiesCamusdarachBeach = Arrays.asList("Parking", "Campsite");
        Beach CamusdarachBeach = new Beach("Lochaber","Lochaber_CamusdarachBeach.png","Lochaber_CamusdarachBeachBeach.jpeg","Camusdarach Beach","OS Landranger 40, NM661918","///fights.pounds.student","56.958104,-5.84868","Mallaig","This beautiful white sand beach provides stunning views of the Cuillins on Skye, as well as several other islands. The short walk from the car park brings you to the north end of the bay, and beginners can easily learn directly off the beach. More experienced snorkelers can explore the rocky outcrops where juvenile fish and crabs take shelter amongst the kelp.", amenitiesCamusdarachBeach);
        beachRepository.save (CamusdarachBeach);

        List<String> amenitiesPrincesCairn = Arrays.asList("Parking");
        Beach PrincesCairn = new Beach("Lochaber","Lochaber_PrincesCairn.png","Lochaber_PrincesCairnBeach.jpeg","Prince's Cairn","OS Landranger 40, NM719844","///royal.hesitate.coil","56.894661,-5.746865","Arasaig","Said to be the site where Bonnie Prince Charlie left Scotland, this advanced site involves a slight scramble through trees and bushes to the shore. Here, the rocky kelp grounds are home to many species of fish and shellfish, and seals watch from the nearby island. Parking is in a shoreside layby just to the west of the site on the main road to Mallaig.", amenitiesPrincesCairn);
        beachRepository.save (PrincesCairn);

        List<String> amenitiesArdnastang = Arrays.asList("Parking", "Cafe");
        Beach Ardnastang = new Beach("Lochaber","Lochaber_Ardnastang.png","Lochaber_ArdnastangBeach.jpeg","Ardnastang","OS Landranger 40, NM799611","///claw.scavenger.minute","56.689643,-5.595774","Sunart","Beginner snorkelers can take to the water straight off the beach, whilst the rocky headland to the south east is suitable for those with more experience. The beach itself hosts a number of species – if you dig into the sand and gravel you may well unearth a number of critters such as lugworms and small crabs.", amenitiesArdnastang);
        beachRepository.save (Ardnastang);

        List<String> amenitiesLochaline = Arrays.asList("Parking", "Cafe");
        Beach Lochaline = new Beach("Lochaber","Lochaber_Lochaline.png","Lochaber_LochalineBeach.jpeg","Lochaline","OS Landranger 49, NM675443","///padding.calculate.rehearsal","56.533029,-5.782644","Lochaline","A quiet beach offering a beginner area just off the sand. More advanced snorkelers can follow the edge of the rocky reef, which is submerged at high water and exposed at low water, to explore the seaweed habitat where a host of other species can be found. Parking is in an off-road gravel car park and there is a nearby café at the ferry terminal.", amenitiesLochaline);
        beachRepository.save (Lochaline);

        List<String> amenitiesLochLinnhePicnicArea = Arrays.asList("Parking", "Campsite");
        Beach LochLinnhePicnicArea = new Beach("Lochaber","Lochaber_LochLinnhePicnicArea.png","Lochaber_LochLinnhePicnicAreaBeach.jpeg","Loch Linnhe Picnic Area","OS Landranger 41, NN039656","///wrist.barman.tractor","56.74182,-5.206736","Corran","Around seven miles south of Fort William, this picnic area offers parking, picnic benches and free camping. The beach to the south side is suitable for beginners and the headland area to the west will allow advanced snorkelers to explore the deeper habitat and environment. A great place for families and groups.", amenitiesLochLinnhePicnicArea);
        beachRepository.save (LochLinnhePicnicArea);

        List<String> amenitiesBishopsBay = Arrays.asList("Parking");
        Beach BishopsBay = new Beach("Lochaber","Lochaber_BishopsBay.png","Lochaber_BishopsBayBeach.jpeg","Bishop's Bay","OS Landranger 41, NN056600","///itself.mural.attaching","56.691152,-5.176016","Ballachulish","Just north of Ballachulish Bridge, park near the old jetty and walk through the woods to a great beach inside of moorings where you can explore the beach and headland. Avoid any boats that are approaching or leaving moorings and enjoy this sheltered bay with its multitude of life.", amenitiesBishopsBay);
        beachRepository.save (BishopsBay);

        //North Argyll - Beaches

        List<String> amenitiesVillageBay = Arrays.asList("Parking", "Cafe");
        Beach VillageBay = new Beach("North Argyll","NorthArgyll_VillageBay.png","NorthArgyll_VillageBayBeach.jpeg","Village Bay","OS Explorer 361, NM813050","///clusters.pigtails.gone","56.187244,-5.525993","Ardfern","Part of Seawilding's seagrass and native oyster restoration work, providing safe habitats that sequester carbon. Enter the water directly opposite the village hall. A great site for beginners, with lots to see in the seagrass bed close to shore.", amenitiesVillageBay);
        beachRepository.save (VillageBay);

        List<String> amenitiesAsknishBay = Arrays.asList("Parking", "Cafe");
        Beach AsknishBay = new Beach("North Argyll","NorthArgyll_AsknishBay.png","NorthArgyll_AsknishBayBeach.jpeg","Asknish Bay","OS Explorer 361, NM801099","///reliving.goodnight.graceful","56.230636,-5.549355","Kilmelford","A wide bay with views of Shuna and Luing. An accessible path leads from the hotel to a boathouse, enter the water here or at the shore/steps of Arduaine jetty. Be aware of boat traffic.", amenitiesAsknishBay);
        beachRepository.save (AsknishBay);

        List<String> amenitiesGanavanSands = Arrays.asList("Parking", "Toilet", "Wheelchair");
        Beach GanavanSands = new Beach("North Argyll","NorthArgyll_GanavanSands.png","NorthArgyll_GanavanSandsBeach.jpeg","Ganavan Sands","OS Explorer 361, NM861326","///herbs.unhappy.situates","56.436947,-5.471238","Oban","A beautiful, popular bay, easily accessible by ramp. Search for well-camoflaged species amongst rocky outcrops and explore lush seagrass meadows. 10 minute cycle/bus journey from Oban. Public toilets with accessible access are on site.", amenitiesGanavanSands);
        beachRepository.save (GanavanSands);

        List<String> amenitiesWeeGanavan = Arrays.asList("Parking");
        Beach WeeGanavan = new Beach("North Argyll","NorthArgyll_WeeGanavan.png","NorthArgyll_WeeGanavanBeach.jpeg","Wee Ganavan"," OS Explorer 361, NM853320","///washroom.extensive.frown","56.431207,-5.48368","Oban","At high tide look for crabs, butterfish and common blenny emerging from seaweed. At low tide look for juvenile wrasse, gobies and scorpionfish amongst the kelp. Be aware - this is an overflow pipe that feeds into the bay after heavy rain.", amenitiesWeeGanavan);
        beachRepository.save (WeeGanavan);

        List<String> amenitiesSAMSBeach = Arrays.asList("Parking", "Cafe");
        Beach SAMSBeach = new Beach("North Argyll","NorthArgyll_SAMSBeach.png","NorthArgyll_SAMSBeachBeach.jpeg","SAMS Beach"," OS Explorer 361, NM879342","///digital.uncle.whistling","56.452094,-5.443379","Dunbeg","This scenic bay is sheltered by rock formations on either side and stunning kelp forests lie beneath. On weekdays, visit the Ocean Explorer Centre to dive deeper into marine science. 30 minute cycle from Oban, or 10 minutes from Ganavan sands.", amenitiesSAMSBeach);
        beachRepository.save (SAMSBeach);

        List<String> amenitiesQueenieReef = Arrays.asList("Parking", "Cafe", "Steps");
        Beach QueenieReef = new Beach("North Argyll","NorthArgyll_QueenieReef.png","NorthArgyll_QueenieReefBeach.jpeg","Queenie Reef","OS Explorer 361, NM986439","///conductor.butter.endings","56.543809,-5.27759","Benderloch","This sheltered bay is on the south shore of Loch Creran, 0.6 miles east of the A828 bridge. From the second layby east of the bridge, follow the paved path to the protruding headland. Steps lead to the shore, take care as these may be slippery. Look for brittlestars that cover the ground in a dense mat at certain times of year. Layby parking possible. 45 minute cycle from North Connel. The Creagan Inn is 1.7 miles away.", amenitiesQueenieReef);
        beachRepository.save (QueenieReef);

        List<String> amenitiesCreagan = Arrays.asList("Parking", "Cafe");
        Beach Creagan = new Beach("North Argyll","NorthArgyll_Creagan.png","NorthArgyll_CreaganBeach.jpeg","Creagan","OS Explorer 361, NM973445","///unicorns.orange.pizza","56.548607,-5.299133","Appin","Loch Creran is one of only two known sites globally where serpulid worms form reefs, creating habitats for many other species. Here on the Loch’s north shore, look for urchins, crabs and otters. 30 minute bus from Oban. 45 minute cycle from North Connel. Parking available at the Creagan Inn, which serves local produce in beautiful surroundings. Showers are available for a small charge.", amenitiesCreagan);
        beachRepository.save (Creagan);














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






        //East-Lothian - Yellowcraig - CreatureBeaches - Fish

        CreatureBeach YellowcraigBallanWrasse = new CreatureBeach(BallanWrasse, Yellowcraig);
        creatureBeachRepository.save(YellowcraigBallanWrasse);

        CreatureBeach YellowcraigButterfish = new CreatureBeach(Butterfish, Yellowcraig);
        creatureBeachRepository.save(YellowcraigButterfish);

        CreatureBeach YellowcraigScorpionfish = new CreatureBeach(Scorpionfish, Yellowcraig);
        creatureBeachRepository.save(YellowcraigScorpionfish);

        CreatureBeach YellowcraigWeaverFish = new CreatureBeach(WeaverFish, Yellowcraig);
        creatureBeachRepository.save(YellowcraigWeaverFish);

        //East-Lothian - Yellowcraig - CreatureBeaches - Crustaceans

        CreatureBeach YellowcraigShoreCrab = new CreatureBeach(ShoreCrab, Yellowcraig);
        creatureBeachRepository.save(YellowcraigShoreCrab);

        CreatureBeach YellowcraigVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, Yellowcraig);
        creatureBeachRepository.save(YellowcraigVelvetSwimmingCrab);

        CreatureBeach YellowcraigEdibleCrab = new CreatureBeach(EdibleCrab, Yellowcraig);
        creatureBeachRepository.save(YellowcraigEdibleCrab);

        CreatureBeach YellowcraigHermitCrab = new CreatureBeach(HermitCrab, Yellowcraig);
        creatureBeachRepository.save(YellowcraigHermitCrab);

        //East-Lothian - Yellowcraig - CreatureBeaches - Snails

        CreatureBeach YellowcraigTopshell = new CreatureBeach(Topshell, Yellowcraig);
        creatureBeachRepository.save(YellowcraigTopshell);

        CreatureBeach YellowcraigDogwhelk = new CreatureBeach(Dogwhelk, Yellowcraig);
        creatureBeachRepository.save(YellowcraigDogwhelk);

        CreatureBeach YellowcraigPeriwinkle = new CreatureBeach(Periwinkle, Yellowcraig);
        creatureBeachRepository.save(YellowcraigPeriwinkle);

        CreatureBeach YellowcraigLimpet = new CreatureBeach(Limpet, Yellowcraig);
        creatureBeachRepository.save(YellowcraigLimpet);

        //East-Lothian - Yellowcraig - CreatureBeaches - Other Invertebrates

        CreatureBeach YellowcraigCommonStarfish = new CreatureBeach(CommonStarfish, Yellowcraig);
        creatureBeachRepository.save(YellowcraigCommonStarfish);

        CreatureBeach YellowcraigBrittlestar = new CreatureBeach(Brittlestar, Yellowcraig);
        creatureBeachRepository.save(YellowcraigBrittlestar);

        CreatureBeach YellowcraigBloodyHenryStarfish = new CreatureBeach(BloodyHenryStarfish, Yellowcraig);
        creatureBeachRepository.save(YellowcraigBloodyHenryStarfish);

        CreatureBeach YellowcraigDeadMansFingers = new CreatureBeach(DeadMansFingers, Yellowcraig);
        creatureBeachRepository.save(YellowcraigDeadMansFingers);

        //East-Lothian - Yellowcraig - CreatureBeaches - Seabirds

        CreatureBeach YellowcraigEider = new CreatureBeach(Eider, Yellowcraig);
        creatureBeachRepository.save(YellowcraigEider);

        CreatureBeach YellowcraigArcticTern = new CreatureBeach(ArcticTern, Yellowcraig);
        creatureBeachRepository.save(YellowcraigArcticTern);

        CreatureBeach YellowcraigGannet = new CreatureBeach(Gannet, Yellowcraig);
        creatureBeachRepository.save(YellowcraigGannet);

        CreatureBeach YellowcraigShag = new CreatureBeach(Shag, Yellowcraig);
        creatureBeachRepository.save(YellowcraigShag);

        //East-Lothian - Yellowcraig - CreatureBeaches - Jellyfish

        CreatureBeach YellowcraigLionsMane = new CreatureBeach(LionsMane, Yellowcraig);
        creatureBeachRepository.save(YellowcraigLionsMane);

        CreatureBeach YellowcraigMoon = new CreatureBeach(Moon, Yellowcraig);
        creatureBeachRepository.save(YellowcraigMoon);

        CreatureBeach YellowcraigBarrel = new CreatureBeach(Barrel, Yellowcraig);
        creatureBeachRepository.save(YellowcraigBarrel);

        CreatureBeach YellowcraigComb = new CreatureBeach(Comb, Yellowcraig);
        creatureBeachRepository.save(YellowcraigComb);

        //East-Lothian - Yellowcraig - CreatureBeaches - Algae

        CreatureBeach YellowcraigBladderWrack = new CreatureBeach(BladderWrack, Yellowcraig);
        creatureBeachRepository.save(YellowcraigBladderWrack);

        CreatureBeach YellowcraigKelp = new CreatureBeach(Kelp, Yellowcraig);
        creatureBeachRepository.save(YellowcraigKelp);

        CreatureBeach YellowcraigSeaLettuce = new CreatureBeach(SeaLettuce, Yellowcraig);
        creatureBeachRepository.save(YellowcraigSeaLettuce);

        CreatureBeach YellowcraigChannelWrack = new CreatureBeach(ChannelWrack, Yellowcraig);
        creatureBeachRepository.save(YellowcraigChannelWrack);

        //East-Lothian - Yellowcraig - CreatureBeaches - Others






        //East-Lothian - ScottishSeabirdCentre - CreatureBeaches - Fish

        CreatureBeach ScottishSeabirdCentreBallanWrasse = new CreatureBeach(BallanWrasse, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreBallanWrasse);

        CreatureBeach ScottishSeabirdCentreButterfish = new CreatureBeach(Butterfish, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreButterfish);

        CreatureBeach ScottishSeabirdCentreScorpionfish = new CreatureBeach(Scorpionfish, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreScorpionfish);

        CreatureBeach ScottishSeabirdCentreWeaverFish = new CreatureBeach(WeaverFish, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreWeaverFish);

        //East-Lothian - ScottishSeabirdCentre - CreatureBeaches - Crustaceans

        CreatureBeach ScottishSeabirdCentreShoreCrab = new CreatureBeach(ShoreCrab, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreShoreCrab);

        CreatureBeach ScottishSeabirdCentreVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreVelvetSwimmingCrab);

        CreatureBeach ScottishSeabirdCentreEdibleCrab = new CreatureBeach(EdibleCrab, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreEdibleCrab);

        CreatureBeach ScottishSeabirdCentreHermitCrab = new CreatureBeach(HermitCrab, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreHermitCrab);

        //East-Lothian - ScottishSeabirdCentre - CreatureBeaches - Snails

        CreatureBeach ScottishSeabirdCentreTopshell = new CreatureBeach(Topshell, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreTopshell);

        CreatureBeach ScottishSeabirdCentreDogwhelk = new CreatureBeach(Dogwhelk, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreDogwhelk);

        CreatureBeach ScottishSeabirdCentrePeriwinkle = new CreatureBeach(Periwinkle, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentrePeriwinkle);

        CreatureBeach ScottishSeabirdCentreLimpet = new CreatureBeach(Limpet, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreLimpet);

        //East-Lothian - ScottishSeabirdCentre - CreatureBeaches - Other Invertebrates

        CreatureBeach ScottishSeabirdCentreCommonStarfish = new CreatureBeach(CommonStarfish, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreCommonStarfish);

        CreatureBeach ScottishSeabirdCentreBrittlestar = new CreatureBeach(Brittlestar, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreBrittlestar);

        CreatureBeach ScottishSeabirdCentreBloodyHenryStarfish = new CreatureBeach(BloodyHenryStarfish, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreBloodyHenryStarfish);

        CreatureBeach ScottishSeabirdCentreDeadMansFingers = new CreatureBeach(DeadMansFingers, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreDeadMansFingers);

        //East-Lothian - ScottishSeabirdCentre - CreatureBeaches - Seabirds

        CreatureBeach ScottishSeabirdCentreEider = new CreatureBeach(Eider, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreEider);

        CreatureBeach ScottishSeabirdCentreArcticTern = new CreatureBeach(ArcticTern, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreArcticTern);

        CreatureBeach ScottishSeabirdCentreGannet = new CreatureBeach(Gannet, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreGannet);

        CreatureBeach ScottishSeabirdCentreShag = new CreatureBeach(Shag, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreShag);

        //East-Lothian - ScottishSeabirdCentre - CreatureBeaches - Jellyfish

        CreatureBeach ScottishSeabirdCentreLionsMane = new CreatureBeach(LionsMane, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreLionsMane);

        CreatureBeach ScottishSeabirdCentreMoon = new CreatureBeach(Moon, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreMoon);

        CreatureBeach ScottishSeabirdCentreBarrel = new CreatureBeach(Barrel, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreBarrel);

        CreatureBeach ScottishSeabirdCentreComb = new CreatureBeach(Comb, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreComb);

        //East-Lothian - ScottishSeabirdCentre - CreatureBeaches - Algae

        CreatureBeach ScottishSeabirdCentreBladderWrack = new CreatureBeach(BladderWrack, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreBladderWrack);

        CreatureBeach ScottishSeabirdCentreKelp = new CreatureBeach(Kelp, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreKelp);

        CreatureBeach ScottishSeabirdCentreSeaLettuce = new CreatureBeach(SeaLettuce, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreSeaLettuce);

        CreatureBeach ScottishSeabirdCentreChannelWrack = new CreatureBeach(ChannelWrack, ScottishSeabirdCentre);
        creatureBeachRepository.save(ScottishSeabirdCentreChannelWrack);

        //East-Lothian - ScottishSeabirdCentre - CreatureBeaches - Others







        //East-Lothian - MilseyBay - CreatureBeaches - Fish

        CreatureBeach MilseyBayBallanWrasse = new CreatureBeach(BallanWrasse, MilseyBay);
        creatureBeachRepository.save(MilseyBayBallanWrasse);

        CreatureBeach MilseyBayButterfish = new CreatureBeach(Butterfish, MilseyBay);
        creatureBeachRepository.save(MilseyBayButterfish);

        CreatureBeach MilseyBayScorpionfish = new CreatureBeach(Scorpionfish, MilseyBay);
        creatureBeachRepository.save(MilseyBayScorpionfish);

        CreatureBeach MilseyBayWeaverFish = new CreatureBeach(WeaverFish, MilseyBay);
        creatureBeachRepository.save(MilseyBayWeaverFish);

        //East-Lothian - MilseyBay - CreatureBeaches - Crustaceans

        CreatureBeach MilseyBayShoreCrab = new CreatureBeach(ShoreCrab, MilseyBay);
        creatureBeachRepository.save(MilseyBayShoreCrab);

        CreatureBeach MilseyBayVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, MilseyBay);
        creatureBeachRepository.save(MilseyBayVelvetSwimmingCrab);

        CreatureBeach MilseyBayEdibleCrab = new CreatureBeach(EdibleCrab, MilseyBay);
        creatureBeachRepository.save(MilseyBayEdibleCrab);

        CreatureBeach MilseyBayHermitCrab = new CreatureBeach(HermitCrab, MilseyBay);
        creatureBeachRepository.save(MilseyBayHermitCrab);

        //East-Lothian - MilseyBay - CreatureBeaches - Snails

        CreatureBeach MilseyBayTopshell = new CreatureBeach(Topshell, MilseyBay);
        creatureBeachRepository.save(MilseyBayTopshell);

        CreatureBeach MilseyBayDogwhelk = new CreatureBeach(Dogwhelk, MilseyBay);
        creatureBeachRepository.save(MilseyBayDogwhelk);

        CreatureBeach MilseyBayPeriwinkle = new CreatureBeach(Periwinkle, MilseyBay);
        creatureBeachRepository.save(MilseyBayPeriwinkle);

        CreatureBeach MilseyBayLimpet = new CreatureBeach(Limpet, MilseyBay);
        creatureBeachRepository.save(MilseyBayLimpet);

        //East-Lothian - MilseyBay - CreatureBeaches - Other Invertebrates

        CreatureBeach MilseyBayCommonStarfish = new CreatureBeach(CommonStarfish, MilseyBay);
        creatureBeachRepository.save(MilseyBayCommonStarfish);

        CreatureBeach MilseyBayBrittlestar = new CreatureBeach(Brittlestar, MilseyBay);
        creatureBeachRepository.save(MilseyBayBrittlestar);

        CreatureBeach MilseyBayBloodyHenryStarfish = new CreatureBeach(BloodyHenryStarfish, MilseyBay);
        creatureBeachRepository.save(MilseyBayBloodyHenryStarfish);

        CreatureBeach MilseyBayDeadMansFingers = new CreatureBeach(DeadMansFingers, MilseyBay);
        creatureBeachRepository.save(MilseyBayDeadMansFingers);

        //East-Lothian - MilseyBay - CreatureBeaches - Seabirds

        CreatureBeach MilseyBayEider = new CreatureBeach(Eider, MilseyBay);
        creatureBeachRepository.save(MilseyBayEider);

        CreatureBeach MilseyBayArcticTern = new CreatureBeach(ArcticTern, MilseyBay);
        creatureBeachRepository.save(MilseyBayArcticTern);

        CreatureBeach MilseyBayGannet = new CreatureBeach(Gannet, MilseyBay);
        creatureBeachRepository.save(MilseyBayGannet);

        CreatureBeach MilseyBayShag = new CreatureBeach(Shag, MilseyBay);
        creatureBeachRepository.save(MilseyBayShag);

        //East-Lothian - MilseyBay - CreatureBeaches - Jellyfish

        CreatureBeach MilseyBayLionsMane = new CreatureBeach(LionsMane, MilseyBay);
        creatureBeachRepository.save(MilseyBayLionsMane);

        CreatureBeach MilseyBayMoon = new CreatureBeach(Moon, MilseyBay);
        creatureBeachRepository.save(MilseyBayMoon);

        CreatureBeach MilseyBayBarrel = new CreatureBeach(Barrel, MilseyBay);
        creatureBeachRepository.save(MilseyBayBarrel);

        CreatureBeach MilseyBayComb = new CreatureBeach(Comb, MilseyBay);
        creatureBeachRepository.save(MilseyBayComb);

        //East-Lothian - MilseyBay - CreatureBeaches - Algae

        CreatureBeach MilseyBayBladderWrack = new CreatureBeach(BladderWrack, MilseyBay);
        creatureBeachRepository.save(MilseyBayBladderWrack);

        CreatureBeach MilseyBayKelp = new CreatureBeach(Kelp, MilseyBay);
        creatureBeachRepository.save(MilseyBayKelp);

        CreatureBeach MilseyBaySeaLettuce = new CreatureBeach(SeaLettuce, MilseyBay);
        creatureBeachRepository.save(MilseyBaySeaLettuce);

        CreatureBeach MilseyBayChannelWrack = new CreatureBeach(ChannelWrack, MilseyBay);
        creatureBeachRepository.save(MilseyBayChannelWrack);

        //East-Lothian - MilseyBay - CreatureBeaches - Others






        //East-Lothian - Dunbar - CreatureBeaches - Fish

        CreatureBeach DunbarBallanWrasse = new CreatureBeach(BallanWrasse, Dunbar);
        creatureBeachRepository.save(DunbarBallanWrasse);

        CreatureBeach DunbarButterfish = new CreatureBeach(Butterfish, Dunbar);
        creatureBeachRepository.save(DunbarButterfish);

        CreatureBeach DunbarScorpionfish = new CreatureBeach(Scorpionfish, Dunbar);
        creatureBeachRepository.save(DunbarScorpionfish);

        CreatureBeach DunbarWeaverFish = new CreatureBeach(WeaverFish, Dunbar);
        creatureBeachRepository.save(DunbarWeaverFish);

        //East-Lothian - Dunbar - CreatureBeaches - Crustaceans

        CreatureBeach DunbarShoreCrab = new CreatureBeach(ShoreCrab, Dunbar);
        creatureBeachRepository.save(DunbarShoreCrab);

        CreatureBeach DunbarVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, Dunbar);
        creatureBeachRepository.save(DunbarVelvetSwimmingCrab);

        CreatureBeach DunbarEdibleCrab = new CreatureBeach(EdibleCrab, Dunbar);
        creatureBeachRepository.save(DunbarEdibleCrab);

        CreatureBeach DunbarHermitCrab = new CreatureBeach(HermitCrab, Dunbar);
        creatureBeachRepository.save(DunbarHermitCrab);

        //East-Lothian - Dunbar - CreatureBeaches - Snails

        CreatureBeach DunbarTopshell = new CreatureBeach(Topshell, Dunbar);
        creatureBeachRepository.save(DunbarTopshell);

        CreatureBeach DunbarDogwhelk = new CreatureBeach(Dogwhelk, Dunbar);
        creatureBeachRepository.save(DunbarDogwhelk);

        CreatureBeach DunbarPeriwinkle = new CreatureBeach(Periwinkle, Dunbar);
        creatureBeachRepository.save(DunbarPeriwinkle);

        CreatureBeach DunbarLimpet = new CreatureBeach(Limpet, Dunbar);
        creatureBeachRepository.save(DunbarLimpet);

        //East-Lothian - Dunbar - CreatureBeaches - Other Invertebrates

        CreatureBeach DunbarCommonStarfish = new CreatureBeach(CommonStarfish, Dunbar);
        creatureBeachRepository.save(DunbarCommonStarfish);

        CreatureBeach DunbarBrittlestar = new CreatureBeach(Brittlestar, Dunbar);
        creatureBeachRepository.save(DunbarBrittlestar);

        CreatureBeach DunbarBloodyHenryStarfish = new CreatureBeach(BloodyHenryStarfish, Dunbar);
        creatureBeachRepository.save(DunbarBloodyHenryStarfish);

        CreatureBeach DunbarDeadMansFingers = new CreatureBeach(DeadMansFingers, Dunbar);
        creatureBeachRepository.save(DunbarDeadMansFingers);

        //East-Lothian - Dunbar - CreatureBeaches - Seabirds

        CreatureBeach DunbarEider = new CreatureBeach(Eider, Dunbar);
        creatureBeachRepository.save(DunbarEider);

        CreatureBeach DunbarArcticTern = new CreatureBeach(ArcticTern, Dunbar);
        creatureBeachRepository.save(DunbarArcticTern);

        CreatureBeach DunbarGannet = new CreatureBeach(Gannet, Dunbar);
        creatureBeachRepository.save(DunbarGannet);

        CreatureBeach DunbarShag = new CreatureBeach(Shag, Dunbar);
        creatureBeachRepository.save(DunbarShag);

        //East-Lothian - Dunbar - CreatureBeaches - Jellyfish

        CreatureBeach DunbarLionsMane = new CreatureBeach(LionsMane, Dunbar);
        creatureBeachRepository.save(DunbarLionsMane);

        CreatureBeach DunbarMoon = new CreatureBeach(Moon, Dunbar);
        creatureBeachRepository.save(DunbarMoon);

        CreatureBeach DunbarBarrel = new CreatureBeach(Barrel, Dunbar);
        creatureBeachRepository.save(DunbarBarrel);

        CreatureBeach DunbarComb = new CreatureBeach(Comb, Dunbar);
        creatureBeachRepository.save(DunbarComb);

        //East-Lothian - Dunbar - CreatureBeaches - Algae

        CreatureBeach DunbarBladderWrack = new CreatureBeach(BladderWrack, Dunbar);
        creatureBeachRepository.save(DunbarBladderWrack);

        CreatureBeach DunbarKelp = new CreatureBeach(Kelp, Dunbar);
        creatureBeachRepository.save(DunbarKelp);

        CreatureBeach DunbarSeaLettuce = new CreatureBeach(SeaLettuce, Dunbar);
        creatureBeachRepository.save(DunbarSeaLettuce);

        CreatureBeach DunbarChannelWrack = new CreatureBeach(ChannelWrack, Dunbar);
        creatureBeachRepository.save(DunbarChannelWrack);

        //East-Lothian - Dunbar - CreatureBeaches - Others





        //Lochaber - CamusdarachBeach - CreatureBeaches - Fish

        CreatureBeach CamusdarachBeachLesserSpottedDogfish = new CreatureBeach(LesserSpottedDogfish, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachLesserSpottedDogfish);

        CreatureBeach CamusdarachBeachBallanWrasse = new CreatureBeach(BallanWrasse, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachBallanWrasse);

        CreatureBeach CamusdarachBeachSandeel = new CreatureBeach(Sandeel, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachSandeel);

        CreatureBeach CamusdarachBeachPollock = new CreatureBeach(Pollock, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachPollock);

        //Lochaber - CamusdarachBeach - CreatureBeaches - Crustaceans

        CreatureBeach CamusdarachBeachShoreCrab = new CreatureBeach(ShoreCrab, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachShoreCrab);

        CreatureBeach CamusdarachBeachVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachVelvetSwimmingCrab);

        CreatureBeach CamusdarachBeachHermitCrab = new CreatureBeach(HermitCrab, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachHermitCrab);

        CreatureBeach CamusdarachBeachEdibleCrab = new CreatureBeach(EdibleCrab, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachEdibleCrab);

        //Lochaber - CamusdarachBeach - CreatureBeaches - Snails

        CreatureBeach CamusdarachBeachTopshell = new CreatureBeach(Topshell, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachTopshell);

        CreatureBeach CamusdarachBeachDogwhelk = new CreatureBeach(Dogwhelk, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachDogwhelk);

        CreatureBeach CamusdarachBeachPeriwinkle = new CreatureBeach(Periwinkle, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachPeriwinkle);

        CreatureBeach CamusdarachBeachLimpet = new CreatureBeach(Limpet, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachLimpet);

        //Lochaber - CamusdarachBeach - CreatureBeaches - Other invertebrates

        CreatureBeach CamusdarachBeachSnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachSnakelocksAnemone);

        CreatureBeach CamusdarachBeachBeadletAnemone = new CreatureBeach(BeadletAnemone, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachBeadletAnemone);

        CreatureBeach CamusdarachBeachBreadcrumbSponge = new CreatureBeach(BreadcrumbSponge, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachBreadcrumbSponge);

        CreatureBeach CamusdarachBeachCuttlefish = new CreatureBeach(Cuttlefish, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachCuttlefish);

        //Lochaber - CamusdarachBeach - CreatureBeaches - Jellyfish

        CreatureBeach CamusdarachBeachLionsMane = new CreatureBeach(LionsMane, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachLionsMane);

        CreatureBeach CamusdarachBeachMoon = new CreatureBeach(Moon, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachMoon);

        CreatureBeach CamusdarachBeachBarrel = new CreatureBeach(Barrel, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachBarrel);

        CreatureBeach CamusdarachBeachStalked = new CreatureBeach(Stalked, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachStalked);

        //Lochaber - CamusdarachBeach - CreatureBeaches - Starfish and urchins

        CreatureBeach CamusdarachBeachCommonStarfish = new CreatureBeach(CommonStarfish, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachCommonStarfish);

        CreatureBeach CamusdarachBeachBrittlestar = new CreatureBeach(Brittlestar, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachBrittlestar);

        CreatureBeach CamusdarachBeachSunstar = new CreatureBeach(Sunstar, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachSunstar);

        CreatureBeach CamusdarachBeachCommonUrchin = new CreatureBeach(CommonUrchin, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachCommonUrchin);

        //Lochaber - CamusdarachBeach - CreatureBeaches - Plants and algae

        CreatureBeach CamusdarachBeachKelp = new CreatureBeach(Kelp, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachKelp);

        CreatureBeach CamusdarachBeachMaerl = new CreatureBeach(Maerl, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachMaerl);

        CreatureBeach CamusdarachBeachEelgrass = new CreatureBeach(Eelgrass, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachEelgrass);

        CreatureBeach CamusdarachBeachBladderWrack = new CreatureBeach(BladderWrack, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachBladderWrack);

        //Lochaber - CamusdarachBeach - CreatureBeaches - Other

        CreatureBeach CamusdarachBeachWhiteTailedEagle = new CreatureBeach(WhiteTailedEagle, CamusdarachBeach);
        creatureBeachRepository.save(CamusdarachBeachWhiteTailedEagle);










        //Lochaber - PrincesCairn - CreatureBeaches - Fish

        CreatureBeach PrincesCairnLesserSpottedDogfish = new CreatureBeach(LesserSpottedDogfish, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnLesserSpottedDogfish);

        CreatureBeach PrincesCairnBallanWrasse = new CreatureBeach(BallanWrasse, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnBallanWrasse);

        CreatureBeach PrincesCairnSandeel = new CreatureBeach(Sandeel, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnSandeel);

        CreatureBeach PrincesCairnPollock = new CreatureBeach(Pollock, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnPollock);

        //Lochaber - PrincesCairn - CreatureBeaches - Crustaceans

        CreatureBeach PrincesCairnShoreCrab = new CreatureBeach(ShoreCrab, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnShoreCrab);

        CreatureBeach PrincesCairnVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnVelvetSwimmingCrab);

        CreatureBeach PrincesCairnHermitCrab = new CreatureBeach(HermitCrab, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnHermitCrab);

        CreatureBeach PrincesCairnEdibleCrab = new CreatureBeach(EdibleCrab, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnEdibleCrab);

        //Lochaber - PrincesCairn - CreatureBeaches - Snails

        CreatureBeach PrincesCairnTopshell = new CreatureBeach(Topshell, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnTopshell);

        CreatureBeach PrincesCairnDogwhelk = new CreatureBeach(Dogwhelk, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnDogwhelk);

        CreatureBeach PrincesCairnPeriwinkle = new CreatureBeach(Periwinkle, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnPeriwinkle);

        CreatureBeach PrincesCairnLimpet = new CreatureBeach(Limpet, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnLimpet);

        //Lochaber - PrincesCairn - CreatureBeaches - Other invertebrates

        CreatureBeach PrincesCairnSnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnSnakelocksAnemone);

        CreatureBeach PrincesCairnBeadletAnemone = new CreatureBeach(BeadletAnemone, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnBeadletAnemone);

        CreatureBeach PrincesCairnBreadcrumbSponge = new CreatureBeach(BreadcrumbSponge, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnBreadcrumbSponge);

        CreatureBeach PrincesCairnCuttlefish = new CreatureBeach(Cuttlefish, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnCuttlefish);

        //Lochaber - PrincesCairn - CreatureBeaches - Jellyfish

        CreatureBeach PrincesCairnLionsMane = new CreatureBeach(LionsMane, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnLionsMane);

        CreatureBeach PrincesCairnMoon = new CreatureBeach(Moon, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnMoon);

        CreatureBeach PrincesCairnBarrel = new CreatureBeach(Barrel, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnBarrel);

        CreatureBeach PrincesCairnStalked = new CreatureBeach(Stalked, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnStalked);

        //Lochaber - PrincesCairn - CreatureBeaches - Starfish and urchins

        CreatureBeach PrincesCairnCommonStarfish = new CreatureBeach(CommonStarfish, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnCommonStarfish);

        CreatureBeach PrincesCairnBrittlestar = new CreatureBeach(Brittlestar, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnBrittlestar);

        CreatureBeach PrincesCairnSunstar = new CreatureBeach(Sunstar, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnSunstar);

        CreatureBeach PrincesCairnCommonUrchin = new CreatureBeach(CommonUrchin, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnCommonUrchin);

        //Lochaber - PrincesCairn - CreatureBeaches - Plants and algae

        CreatureBeach PrincesCairnKelp = new CreatureBeach(Kelp, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnKelp);

        CreatureBeach PrincesCairnMaerl = new CreatureBeach(Maerl, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnMaerl);

        CreatureBeach PrincesCairnEelgrass = new CreatureBeach(Eelgrass, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnEelgrass);

        CreatureBeach PrincesCairnBladderWrack = new CreatureBeach(BladderWrack, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnBladderWrack);

        //Lochaber - PrincesCairn - CreatureBeaches - Other

        CreatureBeach PrincesCairnWhiteTailedEagle = new CreatureBeach(WhiteTailedEagle, PrincesCairn);
        creatureBeachRepository.save(PrincesCairnWhiteTailedEagle);












        //Lochaber - Ardnastang - CreatureBeaches - Fish

        CreatureBeach ArdnastangLesserSpottedDogfish = new CreatureBeach(LesserSpottedDogfish, Ardnastang);
        creatureBeachRepository.save(ArdnastangLesserSpottedDogfish);

        CreatureBeach ArdnastangBallanWrasse = new CreatureBeach(BallanWrasse, Ardnastang);
        creatureBeachRepository.save(ArdnastangBallanWrasse);

        CreatureBeach ArdnastangSandeel = new CreatureBeach(Sandeel, Ardnastang);
        creatureBeachRepository.save(ArdnastangSandeel);

        CreatureBeach ArdnastangPollock = new CreatureBeach(Pollock, Ardnastang);
        creatureBeachRepository.save(ArdnastangPollock);

        //Lochaber - Ardnastang - CreatureBeaches - Crustaceans

        CreatureBeach ArdnastangShoreCrab = new CreatureBeach(ShoreCrab, Ardnastang);
        creatureBeachRepository.save(ArdnastangShoreCrab);

        CreatureBeach ArdnastangVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, Ardnastang);
        creatureBeachRepository.save(ArdnastangVelvetSwimmingCrab);

        CreatureBeach ArdnastangHermitCrab = new CreatureBeach(HermitCrab, Ardnastang);
        creatureBeachRepository.save(ArdnastangHermitCrab);

        CreatureBeach ArdnastangEdibleCrab = new CreatureBeach(EdibleCrab, Ardnastang);
        creatureBeachRepository.save(ArdnastangEdibleCrab);

        //Lochaber - Ardnastang - CreatureBeaches - Snails

        CreatureBeach ArdnastangTopshell = new CreatureBeach(Topshell, Ardnastang);
        creatureBeachRepository.save(ArdnastangTopshell);

        CreatureBeach ArdnastangDogwhelk = new CreatureBeach(Dogwhelk, Ardnastang);
        creatureBeachRepository.save(ArdnastangDogwhelk);

        CreatureBeach ArdnastangPeriwinkle = new CreatureBeach(Periwinkle, Ardnastang);
        creatureBeachRepository.save(ArdnastangPeriwinkle);

        CreatureBeach ArdnastangLimpet = new CreatureBeach(Limpet, Ardnastang);
        creatureBeachRepository.save(ArdnastangLimpet);

        //Lochaber - Ardnastang - CreatureBeaches - Other invertebrates

        CreatureBeach ArdnastangSnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, Ardnastang);
        creatureBeachRepository.save(ArdnastangSnakelocksAnemone);

        CreatureBeach ArdnastangBeadletAnemone = new CreatureBeach(BeadletAnemone, Ardnastang);
        creatureBeachRepository.save(ArdnastangBeadletAnemone);

        CreatureBeach ArdnastangBreadcrumbSponge = new CreatureBeach(BreadcrumbSponge, Ardnastang);
        creatureBeachRepository.save(ArdnastangBreadcrumbSponge);

        CreatureBeach ArdnastangCuttlefish = new CreatureBeach(Cuttlefish, Ardnastang);
        creatureBeachRepository.save(ArdnastangCuttlefish);

        //Lochaber - Ardnastang - CreatureBeaches - Jellyfish

        CreatureBeach ArdnastangLionsMane = new CreatureBeach(LionsMane, Ardnastang);
        creatureBeachRepository.save(ArdnastangLionsMane);

        CreatureBeach ArdnastangMoon = new CreatureBeach(Moon, Ardnastang);
        creatureBeachRepository.save(ArdnastangMoon);

        CreatureBeach ArdnastangBarrel = new CreatureBeach(Barrel, Ardnastang);
        creatureBeachRepository.save(ArdnastangBarrel);

        CreatureBeach ArdnastangStalked = new CreatureBeach(Stalked, Ardnastang);
        creatureBeachRepository.save(ArdnastangStalked);

        //Lochaber - Ardnastang - CreatureBeaches - Starfish and urchins

        CreatureBeach ArdnastangCommonStarfish = new CreatureBeach(CommonStarfish, Ardnastang);
        creatureBeachRepository.save(ArdnastangCommonStarfish);

        CreatureBeach ArdnastangBrittlestar = new CreatureBeach(Brittlestar, Ardnastang);
        creatureBeachRepository.save(ArdnastangBrittlestar);

        CreatureBeach ArdnastangSunstar = new CreatureBeach(Sunstar, Ardnastang);
        creatureBeachRepository.save(ArdnastangSunstar);

        CreatureBeach ArdnastangCommonUrchin = new CreatureBeach(CommonUrchin, Ardnastang);
        creatureBeachRepository.save(ArdnastangCommonUrchin);

        //Lochaber - Ardnastang - CreatureBeaches - Plants and algae

        CreatureBeach ArdnastangKelp = new CreatureBeach(Kelp, Ardnastang);
        creatureBeachRepository.save(ArdnastangKelp);

        CreatureBeach ArdnastangMaerl = new CreatureBeach(Maerl, Ardnastang);
        creatureBeachRepository.save(ArdnastangMaerl);

        CreatureBeach ArdnastangEelgrass = new CreatureBeach(Eelgrass, Ardnastang);
        creatureBeachRepository.save(ArdnastangEelgrass);

        CreatureBeach ArdnastangBladderWrack = new CreatureBeach(BladderWrack, Ardnastang);
        creatureBeachRepository.save(ArdnastangBladderWrack);

        //Lochaber - Ardnastang - CreatureBeaches - Other

        CreatureBeach ArdnastangWhiteTailedEagle = new CreatureBeach(WhiteTailedEagle, Ardnastang);
        creatureBeachRepository.save(ArdnastangWhiteTailedEagle);









        //Lochaber - Lochaline - CreatureBeaches - Fish

        CreatureBeach LochalineLesserSpottedDogfish = new CreatureBeach(LesserSpottedDogfish, Lochaline);
        creatureBeachRepository.save(LochalineLesserSpottedDogfish);

        CreatureBeach LochalineBallanWrasse = new CreatureBeach(BallanWrasse, Lochaline);
        creatureBeachRepository.save(LochalineBallanWrasse);

        CreatureBeach LochalineSandeel = new CreatureBeach(Sandeel, Lochaline);
        creatureBeachRepository.save(LochalineSandeel);

        CreatureBeach LochalinePollock = new CreatureBeach(Pollock, Lochaline);
        creatureBeachRepository.save(LochalinePollock);

        //Lochaber - Lochaline - CreatureBeaches - Crustaceans

        CreatureBeach LochalineShoreCrab = new CreatureBeach(ShoreCrab, Lochaline);
        creatureBeachRepository.save(LochalineShoreCrab);

        CreatureBeach LochalineVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, Lochaline);
        creatureBeachRepository.save(LochalineVelvetSwimmingCrab);

        CreatureBeach LochalineHermitCrab = new CreatureBeach(HermitCrab, Lochaline);
        creatureBeachRepository.save(LochalineHermitCrab);

        CreatureBeach LochalineEdibleCrab = new CreatureBeach(EdibleCrab, Lochaline);
        creatureBeachRepository.save(LochalineEdibleCrab);

        //Lochaber - Lochaline - CreatureBeaches - Snails

        CreatureBeach LochalineTopshell = new CreatureBeach(Topshell, Lochaline);
        creatureBeachRepository.save(LochalineTopshell);

        CreatureBeach LochalineDogwhelk = new CreatureBeach(Dogwhelk, Lochaline);
        creatureBeachRepository.save(LochalineDogwhelk);

        CreatureBeach LochalinePeriwinkle = new CreatureBeach(Periwinkle, Lochaline);
        creatureBeachRepository.save(LochalinePeriwinkle);

        CreatureBeach LochalineLimpet = new CreatureBeach(Limpet, Lochaline);
        creatureBeachRepository.save(LochalineLimpet);

        //Lochaber - Lochaline - CreatureBeaches - Other invertebrates

        CreatureBeach LochalineSnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, Lochaline);
        creatureBeachRepository.save(LochalineSnakelocksAnemone);

        CreatureBeach LochalineBeadletAnemone = new CreatureBeach(BeadletAnemone, Lochaline);
        creatureBeachRepository.save(LochalineBeadletAnemone);

        CreatureBeach LochalineBreadcrumbSponge = new CreatureBeach(BreadcrumbSponge, Lochaline);
        creatureBeachRepository.save(LochalineBreadcrumbSponge);

        CreatureBeach LochalineCuttlefish = new CreatureBeach(Cuttlefish, Lochaline);
        creatureBeachRepository.save(LochalineCuttlefish);

        //Lochaber - Lochaline - CreatureBeaches - Jellyfish

        CreatureBeach LochalineLionsMane = new CreatureBeach(LionsMane, Lochaline);
        creatureBeachRepository.save(LochalineLionsMane);

        CreatureBeach LochalineMoon = new CreatureBeach(Moon, Lochaline);
        creatureBeachRepository.save(LochalineMoon);

        CreatureBeach LochalineBarrel = new CreatureBeach(Barrel, Lochaline);
        creatureBeachRepository.save(LochalineBarrel);

        CreatureBeach LochalineStalked = new CreatureBeach(Stalked, Lochaline);
        creatureBeachRepository.save(LochalineStalked);

        //Lochaber - Lochaline - CreatureBeaches - Starfish and urchins

        CreatureBeach LochalineCommonStarfish = new CreatureBeach(CommonStarfish, Lochaline);
        creatureBeachRepository.save(LochalineCommonStarfish);

        CreatureBeach LochalineBrittlestar = new CreatureBeach(Brittlestar, Lochaline);
        creatureBeachRepository.save(LochalineBrittlestar);

        CreatureBeach LochalineSunstar = new CreatureBeach(Sunstar, Lochaline);
        creatureBeachRepository.save(LochalineSunstar);

        CreatureBeach LochalineCommonUrchin = new CreatureBeach(CommonUrchin, Lochaline);
        creatureBeachRepository.save(LochalineCommonUrchin);

        //Lochaber - Lochaline - CreatureBeaches - Plants and algae

        CreatureBeach LochalineKelp = new CreatureBeach(Kelp, Lochaline);
        creatureBeachRepository.save(LochalineKelp);

        CreatureBeach LochalineMaerl = new CreatureBeach(Maerl, Lochaline);
        creatureBeachRepository.save(LochalineMaerl);

        CreatureBeach LochalineEelgrass = new CreatureBeach(Eelgrass, Lochaline);
        creatureBeachRepository.save(LochalineEelgrass);

        CreatureBeach LochalineBladderWrack = new CreatureBeach(BladderWrack, Lochaline);
        creatureBeachRepository.save(LochalineBladderWrack);

        //Lochaber - Lochaline - CreatureBeaches - Other

        CreatureBeach LochalineWhiteTailedEagle = new CreatureBeach(WhiteTailedEagle, Lochaline);
        creatureBeachRepository.save(LochalineWhiteTailedEagle);









        //Lochaber - LochLinnhePicnicArea - CreatureBeaches - Fish

        CreatureBeach LochLinnhePicnicAreaLesserSpottedDogfish = new CreatureBeach(LesserSpottedDogfish, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaLesserSpottedDogfish);

        CreatureBeach LochLinnhePicnicAreaBallanWrasse = new CreatureBeach(BallanWrasse, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaBallanWrasse);

        CreatureBeach LochLinnhePicnicAreaSandeel = new CreatureBeach(Sandeel, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaSandeel);

        CreatureBeach LochLinnhePicnicAreaPollock = new CreatureBeach(Pollock, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaPollock);

        //Lochaber - LochLinnhePicnicArea - CreatureBeaches - Crustaceans

        CreatureBeach LochLinnhePicnicAreaShoreCrab = new CreatureBeach(ShoreCrab, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaShoreCrab);

        CreatureBeach LochLinnhePicnicAreaVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaVelvetSwimmingCrab);

        CreatureBeach LochLinnhePicnicAreaHermitCrab = new CreatureBeach(HermitCrab, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaHermitCrab);

        CreatureBeach LochLinnhePicnicAreaEdibleCrab = new CreatureBeach(EdibleCrab, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaEdibleCrab);

        //Lochaber - LochLinnhePicnicArea - CreatureBeaches - Snails

        CreatureBeach LochLinnhePicnicAreaTopshell = new CreatureBeach(Topshell, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaTopshell);

        CreatureBeach LochLinnhePicnicAreaDogwhelk = new CreatureBeach(Dogwhelk, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaDogwhelk);

        CreatureBeach LochLinnhePicnicAreaPeriwinkle = new CreatureBeach(Periwinkle, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaPeriwinkle);

        CreatureBeach LochLinnhePicnicAreaLimpet = new CreatureBeach(Limpet, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaLimpet);

        //Lochaber - LochLinnhePicnicArea - CreatureBeaches - Other invertebrates

        CreatureBeach LochLinnhePicnicAreaSnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaSnakelocksAnemone);

        CreatureBeach LochLinnhePicnicAreaBeadletAnemone = new CreatureBeach(BeadletAnemone, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaBeadletAnemone);

        CreatureBeach LochLinnhePicnicAreaBreadcrumbSponge = new CreatureBeach(BreadcrumbSponge, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaBreadcrumbSponge);

        CreatureBeach LochLinnhePicnicAreaCuttlefish = new CreatureBeach(Cuttlefish, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaCuttlefish);

        //Lochaber - LochLinnhePicnicArea - CreatureBeaches - Jellyfish

        CreatureBeach LochLinnhePicnicAreaLionsMane = new CreatureBeach(LionsMane, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaLionsMane);

        CreatureBeach LochLinnhePicnicAreaMoon = new CreatureBeach(Moon, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaMoon);

        CreatureBeach LochLinnhePicnicAreaBarrel = new CreatureBeach(Barrel, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaBarrel);

        CreatureBeach LochLinnhePicnicAreaStalked = new CreatureBeach(Stalked, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaStalked);

        //Lochaber - LochLinnhePicnicArea - CreatureBeaches - Starfish and urchins

        CreatureBeach LochLinnhePicnicAreaCommonStarfish = new CreatureBeach(CommonStarfish, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaCommonStarfish);

        CreatureBeach LochLinnhePicnicAreaBrittlestar = new CreatureBeach(Brittlestar, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaBrittlestar);

        CreatureBeach LochLinnhePicnicAreaSunstar = new CreatureBeach(Sunstar, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaSunstar);

        CreatureBeach LochLinnhePicnicAreaCommonUrchin = new CreatureBeach(CommonUrchin, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaCommonUrchin);

        //Lochaber - LochLinnhePicnicArea - CreatureBeaches - Plants and algae

        CreatureBeach LochLinnhePicnicAreaKelp = new CreatureBeach(Kelp, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaKelp);

        CreatureBeach LochLinnhePicnicAreaMaerl = new CreatureBeach(Maerl, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaMaerl);

        CreatureBeach LochLinnhePicnicAreaEelgrass = new CreatureBeach(Eelgrass, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaEelgrass);

        CreatureBeach LochLinnhePicnicAreaBladderWrack = new CreatureBeach(BladderWrack, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaBladderWrack);

        //Lochaber - LochLinnhePicnicArea - CreatureBeaches - Other

        CreatureBeach LochLinnhePicnicAreaWhiteTailedEagle = new CreatureBeach(WhiteTailedEagle, LochLinnhePicnicArea);
        creatureBeachRepository.save(LochLinnhePicnicAreaWhiteTailedEagle);





        //Lochaber - BishopsBay - CreatureBeaches - Fish

        CreatureBeach BishopsBayLesserSpottedDogfish = new CreatureBeach(LesserSpottedDogfish, BishopsBay);
        creatureBeachRepository.save(BishopsBayLesserSpottedDogfish);

        CreatureBeach BishopsBayBallanWrasse = new CreatureBeach(BallanWrasse, BishopsBay);
        creatureBeachRepository.save(BishopsBayBallanWrasse);

        CreatureBeach BishopsBaySandeel = new CreatureBeach(Sandeel, BishopsBay);
        creatureBeachRepository.save(BishopsBaySandeel);

        CreatureBeach BishopsBayPollock = new CreatureBeach(Pollock, BishopsBay);
        creatureBeachRepository.save(BishopsBayPollock);

        //Lochaber - BishopsBay - CreatureBeaches - Crustaceans

        CreatureBeach BishopsBayShoreCrab = new CreatureBeach(ShoreCrab, BishopsBay);
        creatureBeachRepository.save(BishopsBayShoreCrab);

        CreatureBeach BishopsBayVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, BishopsBay);
        creatureBeachRepository.save(BishopsBayVelvetSwimmingCrab);

        CreatureBeach BishopsBayHermitCrab = new CreatureBeach(HermitCrab, BishopsBay);
        creatureBeachRepository.save(BishopsBayHermitCrab);

        CreatureBeach BishopsBayEdibleCrab = new CreatureBeach(EdibleCrab, BishopsBay);
        creatureBeachRepository.save(BishopsBayEdibleCrab);

        //Lochaber - BishopsBay - CreatureBeaches - Snails

        CreatureBeach BishopsBayTopshell = new CreatureBeach(Topshell, BishopsBay);
        creatureBeachRepository.save(BishopsBayTopshell);

        CreatureBeach BishopsBayDogwhelk = new CreatureBeach(Dogwhelk, BishopsBay);
        creatureBeachRepository.save(BishopsBayDogwhelk);

        CreatureBeach BishopsBayPeriwinkle = new CreatureBeach(Periwinkle, BishopsBay);
        creatureBeachRepository.save(BishopsBayPeriwinkle);

        CreatureBeach BishopsBayLimpet = new CreatureBeach(Limpet, BishopsBay);
        creatureBeachRepository.save(BishopsBayLimpet);

        //Lochaber - BishopsBay - CreatureBeaches - Other invertebrates

        CreatureBeach BishopsBaySnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, BishopsBay);
        creatureBeachRepository.save(BishopsBaySnakelocksAnemone);

        CreatureBeach BishopsBayBeadletAnemone = new CreatureBeach(BeadletAnemone, BishopsBay);
        creatureBeachRepository.save(BishopsBayBeadletAnemone);

        CreatureBeach BishopsBayBreadcrumbSponge = new CreatureBeach(BreadcrumbSponge, BishopsBay);
        creatureBeachRepository.save(BishopsBayBreadcrumbSponge);

        CreatureBeach BishopsBayCuttlefish = new CreatureBeach(Cuttlefish, BishopsBay);
        creatureBeachRepository.save(BishopsBayCuttlefish);

        //Lochaber - BishopsBay - CreatureBeaches - Jellyfish

        CreatureBeach BishopsBayLionsMane = new CreatureBeach(LionsMane, BishopsBay);
        creatureBeachRepository.save(BishopsBayLionsMane);

        CreatureBeach BishopsBayMoon = new CreatureBeach(Moon, BishopsBay);
        creatureBeachRepository.save(BishopsBayMoon);

        CreatureBeach BishopsBayBarrel = new CreatureBeach(Barrel, BishopsBay);
        creatureBeachRepository.save(BishopsBayBarrel);

        CreatureBeach BishopsBayStalked = new CreatureBeach(Stalked, BishopsBay);
        creatureBeachRepository.save(BishopsBayStalked);

        //Lochaber - BishopsBay - CreatureBeaches - Starfish and urchins

        CreatureBeach BishopsBayCommonStarfish = new CreatureBeach(CommonStarfish, BishopsBay);
        creatureBeachRepository.save(BishopsBayCommonStarfish);

        CreatureBeach BishopsBayBrittlestar = new CreatureBeach(Brittlestar, BishopsBay);
        creatureBeachRepository.save(BishopsBayBrittlestar);

        CreatureBeach BishopsBaySunstar = new CreatureBeach(Sunstar, BishopsBay);
        creatureBeachRepository.save(BishopsBaySunstar);

        CreatureBeach BishopsBayCommonUrchin = new CreatureBeach(CommonUrchin, BishopsBay);
        creatureBeachRepository.save(BishopsBayCommonUrchin);

        //Lochaber - BishopsBay - CreatureBeaches - Plants and algae

        CreatureBeach BishopsBayKelp = new CreatureBeach(Kelp, BishopsBay);
        creatureBeachRepository.save(BishopsBayKelp);

        CreatureBeach BishopsBayMaerl = new CreatureBeach(Maerl, BishopsBay);
        creatureBeachRepository.save(BishopsBayMaerl);

        CreatureBeach BishopsBayEelgrass = new CreatureBeach(Eelgrass, BishopsBay);
        creatureBeachRepository.save(BishopsBayEelgrass);

        CreatureBeach BishopsBayBladderWrack = new CreatureBeach(BladderWrack, BishopsBay);
        creatureBeachRepository.save(BishopsBayBladderWrack);

        //Lochaber - BishopsBay - CreatureBeaches - Other

        CreatureBeach BishopsBayWhiteTailedEagle = new CreatureBeach(WhiteTailedEagle, BishopsBay);
        creatureBeachRepository.save(BishopsBayWhiteTailedEagle);








        //North Argyll - VillageBay - CreatureBeaches - Fish

        CreatureBeach VillageBayButterfish = new CreatureBeach(Butterfish, VillageBay);
        creatureBeachRepository.save(VillageBayButterfish);

        CreatureBeach VillageBayGreaterPipeFish = new CreatureBeach(GreaterPipeFish, VillageBay);
        creatureBeachRepository.save(VillageBayGreaterPipeFish);

        CreatureBeach VillageBayLongSpinedSeaScorpion = new CreatureBeach(LongSpinedSeaScorpion, VillageBay);
        creatureBeachRepository.save(VillageBayLongSpinedSeaScorpion);

        CreatureBeach VillageBayCommonBlenny = new CreatureBeach(CommonBlenny, VillageBay);
        creatureBeachRepository.save(VillageBayCommonBlenny);

        //North Argyll - VillageBay - CreatureBeaches - Crustaceans

        CreatureBeach VillageBayShoreCrab = new CreatureBeach(ShoreCrab, VillageBay);
        creatureBeachRepository.save(VillageBayShoreCrab);

        CreatureBeach VillageBayVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, VillageBay);
        creatureBeachRepository.save(VillageBayVelvetSwimmingCrab);

        CreatureBeach VillageBayEdibleCrab = new CreatureBeach(EdibleCrab, VillageBay);
        creatureBeachRepository.save(VillageBayEdibleCrab);

        CreatureBeach VillageBayHermitCrab = new CreatureBeach(HermitCrab, VillageBay);
        creatureBeachRepository.save(VillageBayHermitCrab);

        //North Argyll - VillageBay - CreatureBeaches - Molluscs

        CreatureBeach VillageBayBlueMussel = new CreatureBeach(BlueMussel, VillageBay);
        creatureBeachRepository.save(VillageBayBlueMussel);

        CreatureBeach VillageBayQueenScallop = new CreatureBeach(QueenScallop, VillageBay);
        creatureBeachRepository.save(VillageBayQueenScallop);

        CreatureBeach VillageBayNativeOyster = new CreatureBeach(NativeOyster, VillageBay);
        creatureBeachRepository.save(VillageBayNativeOyster);

        CreatureBeach VillageBayLimpet = new CreatureBeach(Limpet, VillageBay);
        creatureBeachRepository.save(VillageBayLimpet);

        //North Argyll - Village Bay - CreatureBeaches - Other Invertebrates

        CreatureBeach VillageBayStrawberryAnemone = new CreatureBeach(StrawberryAnemone, VillageBay);
        creatureBeachRepository.save(VillageBayStrawberryAnemone);

        CreatureBeach VillageBaySerpulidWorm = new CreatureBeach(SerpulidWorm, VillageBay);
        creatureBeachRepository.save(VillageBaySerpulidWorm);

        CreatureBeach VillageBaySnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, VillageBay);
        creatureBeachRepository.save(VillageBaySnakelocksAnemone);

        CreatureBeach VillageBayBeadletAnemone = new CreatureBeach(BeadletAnemone, VillageBay);
        creatureBeachRepository.save(VillageBayBeadletAnemone);

        //North Argyll - Village Bay - CreatureBeaches - Jellyfish

        CreatureBeach VillageBayLionsMane = new CreatureBeach(LionsMane, VillageBay);
        creatureBeachRepository.save(VillageBayLionsMane);

        CreatureBeach VillageBayMoon = new CreatureBeach(Moon, VillageBay);
        creatureBeachRepository.save(VillageBayMoon);

        CreatureBeach VillageBayBarrel = new CreatureBeach(Barrel, VillageBay);
        creatureBeachRepository.save(VillageBayBarrel);

        CreatureBeach VillageBayComb = new CreatureBeach(Comb, VillageBay);
        creatureBeachRepository.save(VillageBayComb);

        //North Argyll - Village Bay - CreatureBeaches - Starfish & Urchins

        CreatureBeach VillageBayCommonStarfish = new CreatureBeach(CommonStarfish, VillageBay);
        creatureBeachRepository.save(VillageBayCommonStarfish);

        CreatureBeach VillageBayBrittlestar = new CreatureBeach(Brittlestar, VillageBay);
        creatureBeachRepository.save(VillageBayBrittlestar);

        CreatureBeach VillageBaySunstar = new CreatureBeach(Sunstar, VillageBay);
        creatureBeachRepository.save(VillageBaySunstar);

        CreatureBeach VillageBayCommonUrchin = new CreatureBeach(CommonUrchin, VillageBay);
        creatureBeachRepository.save(VillageBayCommonUrchin);

        //North Argyll - Village Bay - CreatureBeaches - Plants & Algae

        CreatureBeach VillageBayKelp = new CreatureBeach(Kelp, VillageBay);
        creatureBeachRepository.save(VillageBayKelp);

        CreatureBeach VillageBayBladderWrack = new CreatureBeach(BladderWrack, VillageBay);
        creatureBeachRepository.save(VillageBayBladderWrack);

        CreatureBeach VillageBaySeagrass = new CreatureBeach(Seagrass, VillageBay);
        creatureBeachRepository.save(VillageBaySeagrass);

        CreatureBeach VillageBayChannelWrack = new CreatureBeach(ChannelWrack, VillageBay);
        creatureBeachRepository.save(VillageBayChannelWrack);


        //North Argyll - Village Bay - CreatureBeaches - Other





        //North Argyll - AsknishBay - CreatureBeaches - Fish

        CreatureBeach AsknishBayButterfish = new CreatureBeach(Butterfish, AsknishBay);
        creatureBeachRepository.save(AsknishBayButterfish);

        CreatureBeach AsknishBayGreaterPipeFish = new CreatureBeach(GreaterPipeFish, AsknishBay);
        creatureBeachRepository.save(AsknishBayGreaterPipeFish);

        CreatureBeach AsknishBayLongSpinedSeaScorpion = new CreatureBeach(LongSpinedSeaScorpion, AsknishBay);
        creatureBeachRepository.save(AsknishBayLongSpinedSeaScorpion);

        CreatureBeach AsknishBayCommonBlenny = new CreatureBeach(CommonBlenny, AsknishBay);
        creatureBeachRepository.save(AsknishBayCommonBlenny);

        //North Argyll - AsknishBay - CreatureBeaches - Crustaceans

        CreatureBeach AsknishBayShoreCrab = new CreatureBeach(ShoreCrab, AsknishBay);
        creatureBeachRepository.save(AsknishBayShoreCrab);

        CreatureBeach AsknishBayVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, AsknishBay);
        creatureBeachRepository.save(AsknishBayVelvetSwimmingCrab);

        CreatureBeach AsknishBayEdibleCrab = new CreatureBeach(EdibleCrab, AsknishBay);
        creatureBeachRepository.save(AsknishBayEdibleCrab);

        CreatureBeach AsknishBayHermitCrab = new CreatureBeach(HermitCrab, AsknishBay);
        creatureBeachRepository.save(AsknishBayHermitCrab);

        //North Argyll - AsknishBay - CreatureBeaches - Molluscs

        CreatureBeach AsknishBayBlueMussel = new CreatureBeach(BlueMussel, AsknishBay);
        creatureBeachRepository.save(AsknishBayBlueMussel);

        CreatureBeach AsknishBayQueenScallop = new CreatureBeach(QueenScallop, AsknishBay);
        creatureBeachRepository.save(AsknishBayQueenScallop);

        CreatureBeach AsknishBayNativeOyster = new CreatureBeach(NativeOyster, AsknishBay);
        creatureBeachRepository.save(AsknishBayNativeOyster);

        CreatureBeach AsknishBayLimpet = new CreatureBeach(Limpet, AsknishBay);
        creatureBeachRepository.save(AsknishBayLimpet);

        //North Argyll - AsknishBay - CreatureBeaches - Other Invertebrates

        CreatureBeach AsknishBayStrawberryAnemone = new CreatureBeach(StrawberryAnemone, AsknishBay);
        creatureBeachRepository.save(AsknishBayStrawberryAnemone);

        CreatureBeach AsknishBaySerpulidWorm = new CreatureBeach(SerpulidWorm, AsknishBay);
        creatureBeachRepository.save(AsknishBaySerpulidWorm);

        CreatureBeach AsknishBaySnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, AsknishBay);
        creatureBeachRepository.save(AsknishBaySnakelocksAnemone);

        CreatureBeach AsknishBayBeadletAnemone = new CreatureBeach(BeadletAnemone, AsknishBay);
        creatureBeachRepository.save(AsknishBayBeadletAnemone);

        //North Argyll - AsknishBay - CreatureBeaches - Jellyfish

        CreatureBeach AsknishBayLionsMane = new CreatureBeach(LionsMane, AsknishBay);
        creatureBeachRepository.save(AsknishBayLionsMane);

        CreatureBeach AsknishBayMoon = new CreatureBeach(Moon, AsknishBay);
        creatureBeachRepository.save(AsknishBayMoon);

        CreatureBeach AsknishBayBarrel = new CreatureBeach(Barrel, AsknishBay);
        creatureBeachRepository.save(AsknishBayBarrel);

        CreatureBeach AsknishBayComb = new CreatureBeach(Comb, AsknishBay);
        creatureBeachRepository.save(AsknishBayComb);

        //North Argyll - AsknishBay - CreatureBeaches - Starfish & Urchins

        CreatureBeach AsknishBayCommonStarfish = new CreatureBeach(CommonStarfish, AsknishBay);
        creatureBeachRepository.save(AsknishBayCommonStarfish);

        CreatureBeach AsknishBayBrittlestar = new CreatureBeach(Brittlestar, AsknishBay);
        creatureBeachRepository.save(AsknishBayBrittlestar);

        CreatureBeach AsknishBaySunstar = new CreatureBeach(Sunstar, AsknishBay);
        creatureBeachRepository.save(AsknishBaySunstar);

        CreatureBeach AsknishBayCommonUrchin = new CreatureBeach(CommonUrchin, AsknishBay);
        creatureBeachRepository.save(AsknishBayCommonUrchin);

        //North Argyll - AsknishBay - CreatureBeaches - Plants & Algae

        CreatureBeach AsknishBayKelp = new CreatureBeach(Kelp, AsknishBay);
        creatureBeachRepository.save(AsknishBayKelp);

        CreatureBeach AsknishBayBladderWrack = new CreatureBeach(BladderWrack, AsknishBay);
        creatureBeachRepository.save(AsknishBayBladderWrack);

        CreatureBeach AsknishBaySeagrass = new CreatureBeach(Seagrass, AsknishBay);
        creatureBeachRepository.save(AsknishBaySeagrass);

        CreatureBeach AsknishBayChannelWrack = new CreatureBeach(ChannelWrack, AsknishBay);
        creatureBeachRepository.save(AsknishBayChannelWrack);


        //North Argyll - AsknishBay - CreatureBeaches - Other











        //North Argyll - GanavanSands - CreatureBeaches - Fish

        CreatureBeach GanavanSandsButterfish = new CreatureBeach(Butterfish, GanavanSands);
        creatureBeachRepository.save(GanavanSandsButterfish);

        CreatureBeach GanavanSandsGreaterPipeFish = new CreatureBeach(GreaterPipeFish, GanavanSands);
        creatureBeachRepository.save(GanavanSandsGreaterPipeFish);

        CreatureBeach GanavanSandsLongSpinedSeaScorpion = new CreatureBeach(LongSpinedSeaScorpion, GanavanSands);
        creatureBeachRepository.save(GanavanSandsLongSpinedSeaScorpion);

        CreatureBeach GanavanSandsCommonBlenny = new CreatureBeach(CommonBlenny, GanavanSands);
        creatureBeachRepository.save(GanavanSandsCommonBlenny);

        //North Argyll - GanavanSands - CreatureBeaches - Crustaceans

        CreatureBeach GanavanSandsShoreCrab = new CreatureBeach(ShoreCrab, GanavanSands);
        creatureBeachRepository.save(GanavanSandsShoreCrab);

        CreatureBeach GanavanSandsVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, GanavanSands);
        creatureBeachRepository.save(GanavanSandsVelvetSwimmingCrab);

        CreatureBeach GanavanSandsEdibleCrab = new CreatureBeach(EdibleCrab, GanavanSands);
        creatureBeachRepository.save(GanavanSandsEdibleCrab);

        CreatureBeach GanavanSandsHermitCrab = new CreatureBeach(HermitCrab, GanavanSands);
        creatureBeachRepository.save(GanavanSandsHermitCrab);

        //North Argyll - GanavanSands - CreatureBeaches - Molluscs

        CreatureBeach GanavanSandsBlueMussel = new CreatureBeach(BlueMussel, GanavanSands);
        creatureBeachRepository.save(GanavanSandsBlueMussel);

        CreatureBeach GanavanSandsQueenScallop = new CreatureBeach(QueenScallop, GanavanSands);
        creatureBeachRepository.save(GanavanSandsQueenScallop);

        CreatureBeach GanavanSandsNativeOyster = new CreatureBeach(NativeOyster, GanavanSands);
        creatureBeachRepository.save(GanavanSandsNativeOyster);

        CreatureBeach GanavanSandsLimpet = new CreatureBeach(Limpet, GanavanSands);
        creatureBeachRepository.save(GanavanSandsLimpet);

        //North Argyll - GanavanSands - CreatureBeaches - Other Invertebrates

        CreatureBeach GanavanSandsStrawberryAnemone = new CreatureBeach(StrawberryAnemone, GanavanSands);
        creatureBeachRepository.save(GanavanSandsStrawberryAnemone);

        CreatureBeach GanavanSandsSerpulidWorm = new CreatureBeach(SerpulidWorm, GanavanSands);
        creatureBeachRepository.save(GanavanSandsSerpulidWorm);

        CreatureBeach GanavanSandsSnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, GanavanSands);
        creatureBeachRepository.save(GanavanSandsSnakelocksAnemone);

        CreatureBeach GanavanSandsBeadletAnemone = new CreatureBeach(BeadletAnemone, GanavanSands);
        creatureBeachRepository.save(GanavanSandsBeadletAnemone);

        //North Argyll - GanavanSands - CreatureBeaches - Jellyfish

        CreatureBeach GanavanSandsLionsMane = new CreatureBeach(LionsMane, GanavanSands);
        creatureBeachRepository.save(GanavanSandsLionsMane);

        CreatureBeach GanavanSandsMoon = new CreatureBeach(Moon, GanavanSands);
        creatureBeachRepository.save(GanavanSandsMoon);

        CreatureBeach GanavanSandsBarrel = new CreatureBeach(Barrel, GanavanSands);
        creatureBeachRepository.save(GanavanSandsBarrel);

        CreatureBeach GanavanSandsComb = new CreatureBeach(Comb, GanavanSands);
        creatureBeachRepository.save(GanavanSandsComb);

        //North Argyll - GanavanSands - CreatureBeaches - Starfish & Urchins

        CreatureBeach GanavanSandsCommonStarfish = new CreatureBeach(CommonStarfish, GanavanSands);
        creatureBeachRepository.save(GanavanSandsCommonStarfish);

        CreatureBeach GanavanSandsBrittlestar = new CreatureBeach(Brittlestar, GanavanSands);
        creatureBeachRepository.save(GanavanSandsBrittlestar);

        CreatureBeach GanavanSandsSunstar = new CreatureBeach(Sunstar, GanavanSands);
        creatureBeachRepository.save(GanavanSandsSunstar);

        CreatureBeach GanavanSandsCommonUrchin = new CreatureBeach(CommonUrchin, GanavanSands);
        creatureBeachRepository.save(GanavanSandsCommonUrchin);

        //North Argyll - GanavanSands - CreatureBeaches - Plants & Algae

        CreatureBeach GanavanSandsKelp = new CreatureBeach(Kelp, GanavanSands);
        creatureBeachRepository.save(GanavanSandsKelp);

        CreatureBeach GanavanSandsBladderWrack = new CreatureBeach(BladderWrack, GanavanSands);
        creatureBeachRepository.save(GanavanSandsBladderWrack);

        CreatureBeach GanavanSandsSeagrass = new CreatureBeach(Seagrass, GanavanSands);
        creatureBeachRepository.save(GanavanSandsSeagrass);

        CreatureBeach GanavanSandsChannelWrack = new CreatureBeach(ChannelWrack, GanavanSands);
        creatureBeachRepository.save(GanavanSandsChannelWrack);


        //North Argyll - GanavanSands - CreatureBeaches - Other









        //North Argyll - WeeGanavan- CreatureBeaches - Fish

        CreatureBeach WeeGanavanButterfish = new CreatureBeach(Butterfish, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanButterfish);

        CreatureBeach WeeGanavanGreaterPipeFish = new CreatureBeach(GreaterPipeFish, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanGreaterPipeFish);

        CreatureBeach WeeGanavanLongSpinedSeaScorpion = new CreatureBeach(LongSpinedSeaScorpion, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanLongSpinedSeaScorpion);

        CreatureBeach WeeGanavanCommonBlenny = new CreatureBeach(CommonBlenny, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanCommonBlenny);

        //North Argyll - WeeGanavan - CreatureBeaches - Crustaceans

        CreatureBeach WeeGanavanShoreCrab = new CreatureBeach(ShoreCrab, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanShoreCrab);

        CreatureBeach WeeGanavanVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanVelvetSwimmingCrab);

        CreatureBeach WeeGanavanEdibleCrab = new CreatureBeach(EdibleCrab, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanEdibleCrab);

        CreatureBeach WeeGanavanHermitCrab = new CreatureBeach(HermitCrab, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanHermitCrab);

        //North Argyll - WeeGanavan - CreatureBeaches - Molluscs

        CreatureBeach WeeGanavanBlueMussel = new CreatureBeach(BlueMussel, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanBlueMussel);

        CreatureBeach WeeGanavanQueenScallop = new CreatureBeach(QueenScallop, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanQueenScallop);

        CreatureBeach WeeGanavanNativeOyster = new CreatureBeach(NativeOyster, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanNativeOyster);

        CreatureBeach WeeGanavanLimpet = new CreatureBeach(Limpet, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanLimpet);

        //North Argyll - WeeGanavan - CreatureBeaches - Other Invertebrates

        CreatureBeach WeeGanavanStrawberryAnemone = new CreatureBeach(StrawberryAnemone, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanStrawberryAnemone);

        CreatureBeach WeeGanavanSerpulidWorm = new CreatureBeach(SerpulidWorm, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanSerpulidWorm);

        CreatureBeach WeeGanavanSnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanSnakelocksAnemone);

        CreatureBeach WeeGanavanBeadletAnemone = new CreatureBeach(BeadletAnemone, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanBeadletAnemone);

        //North Argyll - WeeGanavan - CreatureBeaches - Jellyfish

        CreatureBeach WeeGanavanLionsMane = new CreatureBeach(LionsMane, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanLionsMane);

        CreatureBeach WeeGanavanMoon = new CreatureBeach(Moon, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanMoon);

        CreatureBeach WeeGanavanBarrel = new CreatureBeach(Barrel, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanBarrel);

        CreatureBeach WeeGanavanComb = new CreatureBeach(Comb, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanComb);

        //North Argyll - WeeGanavan - CreatureBeaches - Starfish & Urchins

        CreatureBeach WeeGanavanCommonStarfish = new CreatureBeach(CommonStarfish, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanCommonStarfish);

        CreatureBeach WeeGanavanBrittlestar = new CreatureBeach(Brittlestar, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanBrittlestar);

        CreatureBeach WeeGanavanSunstar = new CreatureBeach(Sunstar, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanSunstar);

        CreatureBeach WeeGanavanCommonUrchin = new CreatureBeach(CommonUrchin, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanCommonUrchin);

        //North Argyll - WeeGanavan - CreatureBeaches - Plants & Algae

        CreatureBeach WeeGanavanKelp = new CreatureBeach(Kelp, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanKelp);

        CreatureBeach WeeGanavanBladderWrack = new CreatureBeach(BladderWrack, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanBladderWrack);

        CreatureBeach WeeGanavanSeagrass = new CreatureBeach(Seagrass, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanSeagrass);

        CreatureBeach WeeGanavanChannelWrack = new CreatureBeach(ChannelWrack, WeeGanavan);
        creatureBeachRepository.save(WeeGanavanChannelWrack);


        //North Argyll - WeeGanavan - CreatureBeaches - Other






        //North Argyll - SAMSBeach- CreatureBeaches - Fish

        CreatureBeach SAMSBeachButterfish = new CreatureBeach(Butterfish, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachButterfish);

        CreatureBeach SAMSBeachGreaterPipeFish = new CreatureBeach(GreaterPipeFish, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachGreaterPipeFish);

        CreatureBeach SAMSBeachLongSpinedSeaScorpion = new CreatureBeach(LongSpinedSeaScorpion, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachLongSpinedSeaScorpion);

        CreatureBeach SAMSBeachCommonBlenny = new CreatureBeach(CommonBlenny, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachCommonBlenny);

        //North Argyll - SAMSBeach - CreatureBeaches - Crustaceans

        CreatureBeach SAMSBeachShoreCrab = new CreatureBeach(ShoreCrab, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachShoreCrab);

        CreatureBeach SAMSBeachVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachVelvetSwimmingCrab);

        CreatureBeach SAMSBeachEdibleCrab = new CreatureBeach(EdibleCrab, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachEdibleCrab);

        CreatureBeach SAMSBeachHermitCrab = new CreatureBeach(HermitCrab, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachHermitCrab);

        //North Argyll - SAMSBeach - CreatureBeaches - Molluscs

        CreatureBeach SAMSBeachBlueMussel = new CreatureBeach(BlueMussel, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachBlueMussel);

        CreatureBeach SAMSBeachQueenScallop = new CreatureBeach(QueenScallop, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachQueenScallop);

        CreatureBeach SAMSBeachNativeOyster = new CreatureBeach(NativeOyster, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachNativeOyster);

        CreatureBeach SAMSBeachLimpet = new CreatureBeach(Limpet, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachLimpet);

        //North Argyll - SAMSBeach - CreatureBeaches - Other Invertebrates

        CreatureBeach SAMSBeachStrawberryAnemone = new CreatureBeach(StrawberryAnemone, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachStrawberryAnemone);

        CreatureBeach SAMSBeachSerpulidWorm = new CreatureBeach(SerpulidWorm, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachSerpulidWorm);

        CreatureBeach SAMSBeachSnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachSnakelocksAnemone);

        CreatureBeach SAMSBeachBeadletAnemone = new CreatureBeach(BeadletAnemone, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachBeadletAnemone);

        //North Argyll - SAMSBeach - CreatureBeaches - Jellyfish

        CreatureBeach SAMSBeachLionsMane = new CreatureBeach(LionsMane, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachLionsMane);

        CreatureBeach SAMSBeachMoon = new CreatureBeach(Moon, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachMoon);

        CreatureBeach SAMSBeachBarrel = new CreatureBeach(Barrel, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachBarrel);

        CreatureBeach SAMSBeachComb = new CreatureBeach(Comb, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachComb);

        //North Argyll - SAMSBeach - CreatureBeaches - Starfish & Urchins

        CreatureBeach SAMSBeachCommonStarfish = new CreatureBeach(CommonStarfish, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachCommonStarfish);

        CreatureBeach SAMSBeachBrittlestar = new CreatureBeach(Brittlestar, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachBrittlestar);

        CreatureBeach SAMSBeachSunstar = new CreatureBeach(Sunstar, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachSunstar);

        CreatureBeach SAMSBeachCommonUrchin = new CreatureBeach(CommonUrchin, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachCommonUrchin);

        //North Argyll - SAMSBeach - CreatureBeaches - Plants & Algae

        CreatureBeach SAMSBeachKelp = new CreatureBeach(Kelp, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachKelp);

        CreatureBeach SAMSBeachBladderWrack = new CreatureBeach(BladderWrack, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachBladderWrack);

        CreatureBeach SAMSBeachSeagrass = new CreatureBeach(Seagrass, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachSeagrass);

        CreatureBeach SAMSBeachChannelWrack = new CreatureBeach(ChannelWrack, SAMSBeach);
        creatureBeachRepository.save(SAMSBeachChannelWrack);


        //North Argyll - SAMSBeach - CreatureBeaches - Other








        //North Argyll - QueenieReef- CreatureBeaches - Fish

        CreatureBeach QueenieReefButterfish = new CreatureBeach(Butterfish, QueenieReef);
        creatureBeachRepository.save(QueenieReefButterfish);

        CreatureBeach QueenieReefGreaterPipeFish = new CreatureBeach(GreaterPipeFish, QueenieReef);
        creatureBeachRepository.save(QueenieReefGreaterPipeFish);

        CreatureBeach QueenieReefLongSpinedSeaScorpion = new CreatureBeach(LongSpinedSeaScorpion, QueenieReef);
        creatureBeachRepository.save(QueenieReefLongSpinedSeaScorpion);

        CreatureBeach QueenieReefCommonBlenny = new CreatureBeach(CommonBlenny, QueenieReef);
        creatureBeachRepository.save(QueenieReefCommonBlenny);

        //North Argyll - QueenieReef - CreatureBeaches - Crustaceans

        CreatureBeach QueenieReefShoreCrab = new CreatureBeach(ShoreCrab, QueenieReef);
        creatureBeachRepository.save(QueenieReefShoreCrab);

        CreatureBeach QueenieReefVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, QueenieReef);
        creatureBeachRepository.save(QueenieReefVelvetSwimmingCrab);

        CreatureBeach QueenieReefEdibleCrab = new CreatureBeach(EdibleCrab, QueenieReef);
        creatureBeachRepository.save(QueenieReefEdibleCrab);

        CreatureBeach QueenieReefHermitCrab = new CreatureBeach(HermitCrab, QueenieReef);
        creatureBeachRepository.save(QueenieReefHermitCrab);

        //North Argyll - QueenieReef - CreatureBeaches - Molluscs

        CreatureBeach QueenieReefBlueMussel = new CreatureBeach(BlueMussel, QueenieReef);
        creatureBeachRepository.save(QueenieReefBlueMussel);

        CreatureBeach QueenieReefQueenScallop = new CreatureBeach(QueenScallop, QueenieReef);
        creatureBeachRepository.save(QueenieReefQueenScallop);

        CreatureBeach QueenieReefNativeOyster = new CreatureBeach(NativeOyster, QueenieReef);
        creatureBeachRepository.save(QueenieReefNativeOyster);

        CreatureBeach QueenieReefLimpet = new CreatureBeach(Limpet, QueenieReef);
        creatureBeachRepository.save(QueenieReefLimpet);

        //North Argyll - QueenieReef - CreatureBeaches - Other Invertebrates

        CreatureBeach QueenieReefStrawberryAnemone = new CreatureBeach(StrawberryAnemone, QueenieReef);
        creatureBeachRepository.save(QueenieReefStrawberryAnemone);

        CreatureBeach QueenieReefSerpulidWorm = new CreatureBeach(SerpulidWorm, QueenieReef);
        creatureBeachRepository.save(QueenieReefSerpulidWorm);

        CreatureBeach QueenieReefSnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, QueenieReef);
        creatureBeachRepository.save(QueenieReefSnakelocksAnemone);

        CreatureBeach QueenieReefBeadletAnemone = new CreatureBeach(BeadletAnemone, QueenieReef);
        creatureBeachRepository.save(QueenieReefBeadletAnemone);

        //North Argyll - QueenieReef - CreatureBeaches - Jellyfish

        CreatureBeach QueenieReefLionsMane = new CreatureBeach(LionsMane, QueenieReef);
        creatureBeachRepository.save(QueenieReefLionsMane);

        CreatureBeach QueenieReefMoon = new CreatureBeach(Moon, QueenieReef);
        creatureBeachRepository.save(QueenieReefMoon);

        CreatureBeach QueenieReefBarrel = new CreatureBeach(Barrel, QueenieReef);
        creatureBeachRepository.save(QueenieReefBarrel);

        CreatureBeach QueenieReefComb = new CreatureBeach(Comb, QueenieReef);
        creatureBeachRepository.save(QueenieReefComb);

        //North Argyll - QueenieReef - CreatureBeaches - Starfish & Urchins

        CreatureBeach QueenieReefCommonStarfish = new CreatureBeach(CommonStarfish, QueenieReef);
        creatureBeachRepository.save(QueenieReefCommonStarfish);

        CreatureBeach QueenieReefBrittlestar = new CreatureBeach(Brittlestar, QueenieReef);
        creatureBeachRepository.save(QueenieReefBrittlestar);

        CreatureBeach QueenieReefSunstar = new CreatureBeach(Sunstar, QueenieReef);
        creatureBeachRepository.save(QueenieReefSunstar);

        CreatureBeach QueenieReefCommonUrchin = new CreatureBeach(CommonUrchin, QueenieReef);
        creatureBeachRepository.save(QueenieReefCommonUrchin);

        //North Argyll - QueenieReef - CreatureBeaches - Plants & Algae

        CreatureBeach QueenieReefKelp = new CreatureBeach(Kelp, QueenieReef);
        creatureBeachRepository.save(QueenieReefKelp);

        CreatureBeach QueenieReefBladderWrack = new CreatureBeach(BladderWrack, QueenieReef);
        creatureBeachRepository.save(QueenieReefBladderWrack);

        CreatureBeach QueenieReefSeagrass = new CreatureBeach(Seagrass, QueenieReef);
        creatureBeachRepository.save(QueenieReefSeagrass);

        CreatureBeach QueenieReefChannelWrack = new CreatureBeach(ChannelWrack, QueenieReef);
        creatureBeachRepository.save(QueenieReefChannelWrack);


        //North Argyll - QueenieReef - CreatureBeaches - Other









        // North Argyll - Creagan- CreatureBeaches - Fish

        CreatureBeach CreaganButterfish = new CreatureBeach(Butterfish, Creagan);
        creatureBeachRepository.save(CreaganButterfish);

        CreatureBeach CreaganGreaterPipeFish = new CreatureBeach(GreaterPipeFish, Creagan);
        creatureBeachRepository.save(CreaganGreaterPipeFish);

        CreatureBeach CreaganLongSpinedSeaScorpion = new CreatureBeach(LongSpinedSeaScorpion, Creagan);
        creatureBeachRepository.save(CreaganLongSpinedSeaScorpion);

        CreatureBeach CreaganCommonBlenny = new CreatureBeach(CommonBlenny, Creagan);
        creatureBeachRepository.save(CreaganCommonBlenny);

        //North Argyll - Creagan - CreatureBeaches - Crustaceans

        CreatureBeach CreaganShoreCrab = new CreatureBeach(ShoreCrab, Creagan);
        creatureBeachRepository.save(CreaganShoreCrab);

        CreatureBeach CreaganVelvetSwimmingCrab = new CreatureBeach(VelvetSwimmingCrab, Creagan);
        creatureBeachRepository.save(CreaganVelvetSwimmingCrab);

        CreatureBeach CreaganEdibleCrab = new CreatureBeach(EdibleCrab, Creagan);
        creatureBeachRepository.save(CreaganEdibleCrab);

        CreatureBeach CreaganHermitCrab = new CreatureBeach(HermitCrab, Creagan);
        creatureBeachRepository.save(CreaganHermitCrab);

        //North Argyll - Creagan - CreatureBeaches - Molluscs

        CreatureBeach CreaganBlueMussel = new CreatureBeach(BlueMussel, Creagan);
        creatureBeachRepository.save(CreaganBlueMussel);

        CreatureBeach CreaganQueenScallop = new CreatureBeach(QueenScallop, Creagan);
        creatureBeachRepository.save(CreaganQueenScallop);

        CreatureBeach CreaganNativeOyster = new CreatureBeach(NativeOyster, Creagan);
        creatureBeachRepository.save(CreaganNativeOyster);

        CreatureBeach CreaganLimpet = new CreatureBeach(Limpet, Creagan);
        creatureBeachRepository.save(CreaganLimpet);

        //North Argyll - Creagan - CreatureBeaches - Other Invertebrates

        CreatureBeach CreaganStrawberryAnemone = new CreatureBeach(StrawberryAnemone, Creagan);
        creatureBeachRepository.save(CreaganStrawberryAnemone);

        CreatureBeach CreaganSerpulidWorm = new CreatureBeach(SerpulidWorm, Creagan);
        creatureBeachRepository.save(CreaganSerpulidWorm);

        CreatureBeach CreaganSnakelocksAnemone = new CreatureBeach(SnakelocksAnemone, Creagan);
        creatureBeachRepository.save(CreaganSnakelocksAnemone);

        CreatureBeach CreaganBeadletAnemone = new CreatureBeach(BeadletAnemone, Creagan);
        creatureBeachRepository.save(CreaganBeadletAnemone);

        //North Argyll - Creagan - CreatureBeaches - Jellyfish

        CreatureBeach CreaganLionsMane = new CreatureBeach(LionsMane, Creagan);
        creatureBeachRepository.save(CreaganLionsMane);

        CreatureBeach CreaganMoon = new CreatureBeach(Moon, Creagan);
        creatureBeachRepository.save(CreaganMoon);

        CreatureBeach CreaganBarrel = new CreatureBeach(Barrel, Creagan);
        creatureBeachRepository.save(CreaganBarrel);

        CreatureBeach CreaganComb = new CreatureBeach(Comb, Creagan);
        creatureBeachRepository.save(CreaganComb);

        //North Argyll - Creagan - CreatureBeaches - Starfish & Urchins

        CreatureBeach CreaganCommonStarfish = new CreatureBeach(CommonStarfish, Creagan);
        creatureBeachRepository.save(CreaganCommonStarfish);

        CreatureBeach CreaganBrittlestar = new CreatureBeach(Brittlestar, Creagan);
        creatureBeachRepository.save(CreaganBrittlestar);

        CreatureBeach CreaganSunstar = new CreatureBeach(Sunstar, Creagan);
        creatureBeachRepository.save(CreaganSunstar);

        CreatureBeach CreaganCommonUrchin = new CreatureBeach(CommonUrchin, Creagan);
        creatureBeachRepository.save(CreaganCommonUrchin);

        //North Argyll - Creagan - CreatureBeaches - Plants & Algae

        CreatureBeach CreaganKelp = new CreatureBeach(Kelp, Creagan);
        creatureBeachRepository.save(CreaganKelp);

        CreatureBeach CreaganBladderWrack = new CreatureBeach(BladderWrack, Creagan);
        creatureBeachRepository.save(CreaganBladderWrack);

        CreatureBeach CreaganSeagrass = new CreatureBeach(Seagrass, Creagan);
        creatureBeachRepository.save(CreaganSeagrass);

        CreatureBeach CreaganChannelWrack = new CreatureBeach(ChannelWrack, Creagan);
        creatureBeachRepository.save(CreaganChannelWrack);


        //North Argyll - Creagan - CreatureBeaches - Other
































    }
}
