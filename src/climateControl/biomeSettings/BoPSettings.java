
package climateControl.biomeSettings;

import climateControl.api.BiomeSettings;
import biomesoplenty.api.biome.BOPBiomes;
import climateControl.api.Climate;
import climateControl.api.ClimateControlRules;
import climateControl.api.ClimateControlSettings;
import climateControl.api.ClimateDistribution;
import com.Zeno410Utils.Acceptor;
import com.Zeno410Utils.Mutable;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;

/**
 *
 * @author Zeno410
 */
public class BoPSettings extends BiomeSettings {


    //public final ID alpsForestSubBiome = new ID("Alps Forest (Sub-Biome)",63);
    public final Element alps = new Element("Alps",177,5,Climate.SNOWY.name);
    //public final ID alpsMountainside = new ID("Alps Mountainside (Sub-Biome)",64);
    //public final Element arctic = new Element("Arctic",178,10,true,Climate.SNOWY.name);
    //public final ID autumnHills = new ID("Autumn Hills",58);
    //public final ID badlands = new ID("Badlands",179);
    public final Element bambooForest = new Element("Bamboo Forest",180,5,true,"WARM");
    public final Element bayou = new Element("Bayou",181,10,true,"WARM");
    public final Element bog = new Element("Bog",183,7,true,"COOL");
    public final Element borealForest = new Element("Boreal Forest",184,10,true,"COOL");
    public final ID brushland = new ID("Brushland",185,true);
    public final Element chaparral = new Element("Chaparral",187,10,true,"WARM");
    public final Element cherryBlossomGrove = new Element("Cherry Blossom Grove",188,3,true,"COOL");
    public final ID coniferousForestSnow = new ID("Coniferous Forest (Snow)",190);
    public final Element coldDesert = new Element("Cold Desert",255,10,true,"COOL");
    public final Element coniferousForest = new Element("Coniferous Forest",189,10,true,"WARM");
    //public final ID coralReefOcean = new ID("Coral Reef (Ocean)",73);
    public final Element coralReef = new Element("Coral Reef",94,0,"OCEAN");
    public final Element crag = new Element("Crag",191,3,"MEDIUM");
    public final Element deadForest = new Element("Dead Forest",192,7,true,"COOL");
    public final Element deadSwamp = new Element("Dead Swamp",194,7,true,"WARM");
    public final Element fen = new Element("Fen",198,true,"WARM");
    public final Element flowerField = new Element("Flower Field",199,3,true,"WARM");
    public final Element flowerIsland = new Element("Flower Island",255,1,true,"DEEP_OCEAN");
    public final ID glacier = new ID("Glacier",203);
    public final Element grassland = new Element("Grassland",204,true,"COOL");
    public final ID gravelBeach = new ID("Gravel Beach",75);
    public final Element grove = new Element("Grove",205,5,"COOL");
    public final Element heathland = new Element("Heathland",206,"COOL");
    public final Element highland = new Element("Highland",210,"COOL");
    public final Element kelpForest = new Element("Kelp Forest",95,0,"OCEAN");
    public final Element lavenderFields = new Element("Lavender Fields",56,3,"WARM");
    public final Element lushDesert = new Element("Lush Desert",214,3,true,"HOT");
    public final ID lushRiver = new ID("Lush River",114);
    public final Element lushSwamp = new Element("Lush Swamp",215,true,"WARM");
    public final Element mangrove = new Element("Mangrove",216,0,"WARM");
    public final Element mapleWoods = new Element("Maple Woods",217,true,"COOL");
    public final Element marsh = new Element("Marsh",218,7,true,"COOL");
    public final Element meadow = new Element("Meadow",219,true,"COOL");
    public final Element moor = new Element("Moor",221,true,"COOL");
    public final Element mountain = new Element("Mountain",222,"WARM");
    public final Element mysticGrove = new Element("Mystic Grove",223,3,"MEDIUM");
    public final ID oasis = new ID("Oasis",224);
    //public final ID oceanicAbyss = new ID("Oceanic Abyss (Ocean)",72);
    public final Element ominousWoods = new Element("Ominous Woods",225,3,"COOL");
    public final Element orchard = new Element("Orchard",226,0,ClimateDistribution.MEDIUM.name());
    public final Element originVally = new Element("Origin Valley",227,1,"MEDIUM");
    public final Element outback = new Element("Outback",228,7,true,"HOT");
    public final Element overgrownCliffs = new Element("Overgrown Cliffs",255,7,true,ClimateDistribution.MEDIUM.name());
    public final Element prairie = new Element("Prairie",231,true,"WARM");
    public final ID quagmire = new ID("Quagmire",232);
    public final Element rainforest = new Element("Rainforest",233,5,true,"WARM");
    public final Element redwoodForest = new Element("Redwood Forest",234,7,true,"COOL");
    public final Element sacredSprings = new Element("Sacred Springs",235,3,ClimateDistribution.MEDIUM.name());
    public final ID savanna = new ID("Savanna",236);
    public final ID savannaPlateau = new ID("Savanna Plateau (Sub-Biome)",61);
    public final Element seasonalForest = new Element("Seasonal Forest",238,true,"COOL");
    public final ID seasonalSpruceForest = new ID("Seasonal Spruce Forest (Sub-Biome)",62);
    public final Element shield = new Element("Shield",239,7,true,"COOL");
    public final ID shore = new ID("Shore",240);
    public final Element shrubland = new Element("Shrubland",241,true,"COOL");
    public final Element sludgepit = new Element("Sludgepit",242,5,true,"WARM");
    public final Element snowyConiferousForest = new Element("Snowy Coniferous Forest",51,true,"SNOWY");
    public final Element snowyForest = new Element("Snowy Forest",51,true,"SNOWY");
    public final Element steppe = new Element("Steppe",244,7,true,Climate.COOL.name);
    public final Element temperateRainforest = new Element("Temperate Rainforest",245,true,"WARM");
    public final Element tropicalRainforest = new Element("Tropical Rainforest",248,5,true,"HOT");
    public final Element tropicalIslands = new Element("Tropical Islands",249,1,true,"DEEP_OCEAN");
    public final Element tundra = new Element("Tundra",250,7,true,"SNOWY");
    public final Element volcano = new Element("Volcanic Island",251,1,true,"DEEP_OCEAN");
    public final Element wasteland = new Element("Wasteland",252,3,"HOT");
    public final Element wetland = new Element("Wetland",253,7,true,"WARM");
    public final Element woodland = new Element("Woodland",254,true,"WARM");

    public final Element denseForest = new Element("Dense Forest",56,false,"COOL");
    public final Element eucalyptusForest = new Element("Eucalyptus Forest",57,false,"WARM");
    public final Element landOfLakes = new Element("Land of Lakes",68,false,"COOL");
    public final ID landOfLakesMarsh = new Element("Land of Lakes Marsh",101,false,"COOL");
    public final Element xericShrubland = new Element("Xeric Shrubland",98,false,"HOT");

    public BoPSettings() {
        super("BoP");
    }

    Acceptor<Integer> crashOnZero = new Acceptor<Integer>() {

        @Override
        public void accept(Integer accepted) {
            throw new RuntimeException("Thicket incidence "+accepted);
        }
    };
    
    Acceptor<Integer> crashOnNegative = new Acceptor<Integer>() {

        @Override
        public void accept(Integer accepted) {
            throw new RuntimeException("Thicket ID "+accepted);
        }
    };

    //private setBoPID()

    @Override
    public void setNativeBiomeIDs(File configDirectory) {
        try{
            this.alps.setIDFrom(BOPBiomes.alps.get());
            this.bambooForest.setIDFrom(BOPBiomes.bamboo_forest.get());
            this.bayou.setIDFrom(BOPBiomes.bayou.get());
            this.bog.setIDFrom(BOPBiomes.bog.get());
            this.borealForest.setIDFrom(BOPBiomes.boreal_forest.get());
            this.chaparral.setIDFrom(BOPBiomes.chaparral.get());
            this.cherryBlossomGrove.setIDFrom(BOPBiomes.cherry_blossom_grove.get());
            this.coniferousForest.setIDFrom(BOPBiomes.coniferous_forest.get());
            this.coralReef.setIDFrom(BOPBiomes.coral_reef.get());
            this.crag.setIDFrom(BOPBiomes.crag.get());
            this.deadForest.setIDFrom(BOPBiomes.dead_forest.get());
            this.deadSwamp.setIDFrom(BOPBiomes.dead_swamp.get());
            this.fen.setIDFrom(BOPBiomes.fen.get());
            this.flowerField.setIDFrom(BOPBiomes.flower_field.get());
            this.flowerIsland.setIDFrom(BOPBiomes.flower_island.get());
            this.grassland.setIDFrom(BOPBiomes.grassland.get());
            this.glacier.setIDFrom(BOPBiomes.glacier.get());
            this.grove.setIDFrom(BOPBiomes.grove.get());
            this.heathland.setIDFrom(BOPBiomes.heathland.get());
            this.highland.setIDFrom(BOPBiomes.highland.get());
            this.kelpForest.setIDFrom(BOPBiomes.kelp_forest.get());
            this.lavenderFields.setIDFrom(BOPBiomes.lavender_fields.get());
            this.lushDesert.setIDFrom(BOPBiomes.lush_desert.get());
            this.lushSwamp.setIDFrom(BOPBiomes.lush_swamp.get());
            this.mangrove.setIDFrom(BOPBiomes.mangrove.get());
            this.mapleWoods.setIDFrom(BOPBiomes.maple_woods.get());
            this.marsh.setIDFrom(BOPBiomes.marsh.get());
            this.meadow.setIDFrom(BOPBiomes.meadow.get());
            this.mysticGrove.setIDFrom(BOPBiomes.mystic_grove.get());
            this.moor.setIDFrom(BOPBiomes.moor.get());
            this.mountain.setIDFrom(BOPBiomes.mountain.get());
            this.ominousWoods.setIDFrom(BOPBiomes.ominous_woods.get());
            this.oasis.setIDFrom(BOPBiomes.oasis.get());
            this.orchard.setIDFrom(BOPBiomes.orchard.get());
            this.originVally.setIDFrom(BOPBiomes.origin_island.get());
            this.outback.setIDFrom(BOPBiomes.outback.get());
            this.overgrownCliffs.setIDFrom(BOPBiomes.overgrown_cliffs.get());
            this.prairie.setIDFrom(BOPBiomes.prairie.get());
            this.quagmire.setIDFrom(BOPBiomes.quagmire.get());
            this.rainforest.setIDFrom(BOPBiomes.rainforest.get());
            this.redwoodForest.setIDFrom(BOPBiomes.redwood_forest.get());
            this.sacredSprings.setIDFrom(BOPBiomes.sacred_springs.get());
            this.savanna.setIDFrom(Biomes.SAVANNA);
            this.savannaPlateau.setIDFrom(Biomes.SAVANNA_PLATEAU);
            this.seasonalForest.setIDFrom(BOPBiomes.seasonal_forest.get());
            this.shield.setIDFrom(BOPBiomes.shield.get());
            this.shrubland.setIDFrom(BOPBiomes.shrubland.get());
            this.snowyConiferousForest.setIDFrom(BOPBiomes.snowy_coniferous_forest.get());
            this.snowyForest.setIDFrom(BOPBiomes.snowy_forest.get());
            this.steppe.setIDFrom(BOPBiomes.steppe.get());
            this.temperateRainforest.setIDFrom(BOPBiomes.temperate_rainforest.get());
            this.tropicalRainforest.setIDFrom(BOPBiomes.tropical_rainforest.get());
            this.tropicalIslands.setIDFrom(BOPBiomes.tropical_island.get());
            this.tundra.setIDFrom(BOPBiomes.tundra.get());;
            this.volcano.setIDFrom(BOPBiomes.volcanic_island.get());
            this.wasteland.setIDFrom(BOPBiomes.wasteland.get());
            this.wetland.setIDFrom(BOPBiomes.wetland.get());
            this.woodland.setIDFrom(BOPBiomes.woodland.get());
            try {
                this.eucalyptusForest.setIDFrom(BOPBiomes.eucalyptus_forest.get());
            } catch (java.lang.NoSuchFieldError e) {
                // disable the "new" biomes in case of "old" BoP
                this.eucalyptusForest.biomeID().set(-1);
            }
            try {
                this.landOfLakes.setIDFrom(BOPBiomes.land_of_lakes.get());
            } catch (java.lang.NoSuchFieldError e) {
                // disable the "new" biomes in case of "old" BoP
                this.landOfLakes.biomeID().set(-1);
            }
            try {
                this.xericShrubland.setIDFrom(BOPBiomes.xeric_shrubland.get());
            } catch (java.lang.NoSuchFieldError e) {
                // disable the "new" biomes in case of "old" BoP
                this.xericShrubland.biomeID().set(-1);
            }
        }
    catch (java.lang.NoClassDefFoundError e) {
        } 
    }

    private HashMap<ID,BiomeReplacer.Variable> subBiomeSets;

    private BiomeReplacer.Variable subBiomeSet(ID biome) {
        BiomeReplacer.Variable result = subBiomeSets.get(biome);
        if (result == null) {
            result = new BiomeReplacer.Variable();
            subBiomeSets.put(biome, result);
        }
        return result;
    }

    private void addSubBiome(ID biome, ID subBiome){
        if (subBiome.active()) {
            //BiomeSettings.logger.info("adding "+subBiome + " to "+ biome);

            subBiomeSet(biome).add(subBiome, 1);
            biome.setSubBiomeChooser(subBiomeSet(biome));
        }
    }

    public void setSubBiomes(ClimateControlSettings settings) {
        subBiomeSets = new HashMap<ID,BiomeReplacer.Variable>();
        ArrayList<BiomeSettings> biomeSettings = settings.biomeSettings();
        for (BiomeSettings biomeSetting: biomeSettings) {
            if (biomeSetting instanceof OceanBiomeSettings) {
                OceanBiomeSettings oceanSettings = (OceanBiomeSettings)biomeSetting;
                addSubBiome(oceanSettings.coastalOcean,this.coralReef);
                addSubBiome(oceanSettings.coastalOcean,this.kelpForest);
            }
        }
    }

    @Override
    public void setRules(ClimateControlRules rules) {
        rules.noBeaches(this.coralReef.biomeID().value());
        rules.noBeaches(this.kelpForest.biomeID().value());
        setVillages(rules);
        // nothing yet
    }
    static final String biomesOnName = "BoPBiomesOn";

    public final Mutable<Boolean> biomesFromConfig = climateControlCategory.booleanSetting(
                        biomesOnName, "", false);

    static final String configName = "BoP";
    public final Mutable<Boolean> biomesInNewWorlds = climateControlCategory.booleanSetting(
                        this.startBiomesName(configName),
                        "Use biome in new worlds and dimensions", true);

    @Override
    public void onNewWorld() {
        biomesFromConfig.set(biomesInNewWorlds);
    }
    
    @Override
    public boolean biomesAreActive() {
        return this.biomesFromConfig.value();
    }
}
