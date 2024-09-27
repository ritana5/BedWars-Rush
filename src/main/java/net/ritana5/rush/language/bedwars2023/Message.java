package net.ritana5.rush.language.bedwars2023;

import com.tomkeuper.bedwars.api.language.Language;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.Arrays;

import static net.ritana5.rush.language.MessagePath.*;

public class Message {

    public Message() {
        setup();
    }

    private void setup() {
        for (Language l : Language.getLanguages()) {
            YamlConfiguration yml = l.getYml();
            switch (l.getIso()) {
                case "pt":
                    yml.addDefault(MESSAGES_ARENA_START_TUTORIAL, Arrays.asList("&a" + "▬".repeat(72),
                            "&f&l                       Bed Wars Rush",
                            "",
                            "&e&l           Todos os geradores estão no máximo!",
                            "&e&l       Sua cama esta protegida! Clique Esquerdo com",
                            "&e&l           uma lã na mão para fazer uma ponte!",
                            "",
                            "&a" + "▬".repeat(72)));
                    yml.addDefault(MESSAGES_BRIDGE_MODE_ACTIVATED, "&a&lMODO DE PONTE ATIVADO");
                    yml.addDefault(MESSAGES_BRIDGE_MODE_DEACTIVATED, "&c&lMODO DE PONTE DESATIVADO");
                default:
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
                break;
            }
            yml.options().copyDefaults(true);
            l.save();
        }
    }
}
