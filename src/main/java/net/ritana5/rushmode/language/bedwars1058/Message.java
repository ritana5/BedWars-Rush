package net.ritana5.rushmode.language.bedwars1058;

import com.andrei1058.bedwars.api.language.Language;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.Arrays;

import static net.ritana5.rushmode.language.MessagePath.*;

public class Message {

    public Message() {
        setup();
    }

    private void setup() {
        for (Language l : Language.getLanguages()) {
            YamlConfiguration yml = l.getYml();
            l.getIso();
            yml.addDefault(MESSAGES_ARENA_START_TUTORIAL, Arrays.asList("&a" + "▬".repeat(72),
                    "&f&l                       Bed Wars Rush",
                    "",
                    "&e&l        All generators are maxed! Your bed has three",
                    "&e&l       layers of protection! Left click while holding",
                    "&e&l             wool to activate bridge building!",
                    "",
                    "&a" + "▬".repeat(72)));
            yml.addDefault(MESSAGES_BRIDGE_MODE_ACTIVATED, "&a&lBRIDGE MODE ACTIVATED");
            yml.addDefault(MESSAGES_BRIDGE_MODE_DEACTIVATED, "&c&lBRIDGE MODE DEACTIVATED");
            yml.options().copyDefaults(true);
            l.save();
        }
//        YamlConfiguration ymlEn = Language.getLang("en").getYml();
//        if (ymlEn.getDefaults().contains(MESSAGES_ARENA_START_TUTORIAL) && ymlEn.getDefaults().contains(MESSAGES_BRIDGE_MODE_ACTIVATED) && ymlEn.getDefaults().contains(MESSAGES_BRIDGE_MODE_DEACTIVATED)) {
//            ymlEn.set(MESSAGES_ARENA_START_TUTORIAL, Arrays.asList("&a" + "▬".repeat(72),
//                    "&f&l                       Bed Wars Rush",
//                    "",
//                    "&e&l        All generators are maxed! Your bed has three",
//                    "&e&l       layers of protection! Left click while holding",
//                    "&e&l             wool to activate bridge building!",
//                    "", "&a" + "▬".repeat(72)));
//            ymlEn.set(MESSAGES_BRIDGE_MODE_ACTIVATED, "&a&lBRIDGE MODE ACTIVATED");
//            ymlEn.set(MESSAGES_BRIDGE_MODE_DEACTIVATED, "&c&lBRIDGE MODE DEACTIVATED");
//
//        } else {
//            ymlEn.addDefault(MESSAGES_ARENA_START_TUTORIAL, Arrays.asList("&a" + "▬".repeat(72),
//                    "&f&l                       Bed Wars Rush",
//                    "",
//                    "&e&l        All generators are maxed! Your bed has three",
//                    "&e&l       layers of protection! Left click while holding",
//                    "&e&l             wool to activate bridge building!",
//                    "", "&a" + "▬".repeat(72)));
//            ymlEn.addDefault(MESSAGES_BRIDGE_MODE_ACTIVATED, "&a&lBRIDGE MODE ACTIVATED");
//            ymlEn.addDefault(MESSAGES_BRIDGE_MODE_DEACTIVATED, "&c&lBRIDGE MODE DEACTIVATED");
//
//        }
//        ymlEn.options().copyDefaults(true);
//        Language.getLang("en").save();
//
//        YamlConfiguration ymlEs = Language.getLang("en").getYml();
//        if (ymlEs.getDefaults().contains(MESSAGES_ARENA_START_TUTORIAL) && ymlEs.getDefaults().contains(MESSAGES_BRIDGE_MODE_ACTIVATED) && ymlEs.getDefaults().contains(MESSAGES_BRIDGE_MODE_DEACTIVATED)) {
//            ymlEs.set(MESSAGES_ARENA_START_TUTORIAL, Arrays.asList("&a" + "▬".repeat(72),
//                    "&f&l                       Bed Wars Rush",
//                    "",
//                    "&e&l       ¡Todos los generadores están al máximo! ¡Tu cama",
//                    "&e&l       tiene tres capas de protección! ¡Haz clic izquierdo",
//                    "&e&l       mientras sostienes lana para activar la construcción",
//                    "&e&l                           de puentes!",
//                    "", "&a" + "▬".repeat(72)));
//            ymlEs.set(MESSAGES_BRIDGE_MODE_ACTIVATED, "&a&lMODO PUENTE ACTIVADO");
//            ymlEs.set(MESSAGES_BRIDGE_MODE_DEACTIVATED, "&c&lMODO PUENTE DESACTIVADO");
//
//        } else {
//            ymlEs.addDefault(MESSAGES_ARENA_START_TUTORIAL, Arrays.asList("&a" + "▬".repeat(72),
//                    "&f&l                       Bed Wars Rush",
//                    "",
//                    "&e&l       ¡Todos los generadores están al máximo! ¡Tu cama",
//                    "&e&l       tiene tres capas de protección! ¡Haz clic izquierdo",
//                    "&e&l       mientras sostienes lana para activar la construcción",
//                    "&e&l                           de puentes!",
//                    "", "&a" + "▬".repeat(72)));
//            ymlEs.addDefault(MESSAGES_BRIDGE_MODE_ACTIVATED, "&a&MODO PUENTE ACTIVADO");
//            ymlEs.addDefault(MESSAGES_BRIDGE_MODE_DEACTIVATED, "&c&lMODO PUENTE DESACTIVADO");
//
//        }
//        ymlEs.options().copyDefaults(true);
//        Language.getLang("es").save();
//
//    }

    }
}