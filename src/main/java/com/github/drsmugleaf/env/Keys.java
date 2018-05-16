package com.github.drsmugleaf.env;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Created by DrSmugleaf on 16/01/2018.
 */
public enum Keys {

    AZURE_TRANSLATOR_KEY,
    BOT_PREFIX("!"),
    DATABASE_URL,
    DISCORD_TOKEN,
    GOOGLE_KEY,
    TRIPWIRE_TEST_USERNAME(""),
    TRIPWIRE_TEST_PASSWORD("");

    @Nonnull
    public final String VALUE;

    Keys(@Nullable String defaultValue) {
        String fileEnvProperty = Env.PROPERTIES.getProperty(name());
        String systemEnvProperty = System.getenv(name());

        if (fileEnvProperty != null) {
            VALUE = fileEnvProperty;
        } else if (systemEnvProperty != null) {
            VALUE = systemEnvProperty;
        } else if (defaultValue != null) {
            VALUE = defaultValue;
        } else {
            throw new InitializationException("Property for environment variable " + this + " is null");
        }
    }

    Keys() {
        this(null);
    }

}
