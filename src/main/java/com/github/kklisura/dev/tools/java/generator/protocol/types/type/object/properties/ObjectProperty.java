package com.github.kklisura.dev.tools.java.generator.protocol.types.type.object.properties;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.kklisura.dev.tools.java.generator.protocol.types.type.object.Property;

/**
 * Object property.
 *
 * @author Kenan Klisura
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
public class ObjectProperty extends Property {
}
