package com.speedment.examples.generated.socialnetwork.generated;

import com.speedment.runtime.core.internal.AbstractApplicationMetadata;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;

/**
 * A {@link com.speedment.runtime.core.ApplicationMetadata} class for the {@link
 * com.speedment.runtime.config.Project} named socialnetwork. This class
 * contains the meta data present at code generation time.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public class GeneratedSocialnetworkMetadata extends AbstractApplicationMetadata {
    
    private final static String METADATA = init();
    
    private static String init() {
        final StringBuilder sb = new StringBuilder();
        initPart0(sb);
        initPart1(sb);
        initPart2(sb);
        initPart3(sb);
        return sb.toString();
    }
    
    @Override
    protected Optional<String> getMetadata() {
        return Optional.of(METADATA);
    }
    
    private static void initPart0(StringBuilder sb) {
        Stream.of(
            "{",
            "  \"config\" : {",
            "    \"expanded\" : true,",
            "    \"companyName\" : \"speedment\",",
            "    \"name\" : \"socialnetwork\",",
            "    \"packageLocation\" : \"src/main/java/\",",
            "    \"packageName\" : \"com.speedment.examples.generated.socialnetwork\",",
            "    \"dbmses\" : [",
            "      {",
            "        \"expanded\" : true,",
            "        \"port\" : 3306,",
            "        \"schemas\" : [",
            "          {",
            "            \"tables\" : [",
            "              {",
            "                \"foreignKeys\" : [",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"foreignKeyColumns\" : [",
            "                      {",
            "                        \"foreignDatabaseName\" : \"db0\",",
            "                        \"foreignSchemaName\" : \"socialnetwork\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"uploader\",",
            "                        \"foreignColumnName\" : \"id\",",
            "                        \"foreignTableName\" : \"user\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"name\" : \"image_uploader_to_user_id\",",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"expanded\" : true,",
            "                \"primaryKeyColumns\" : [",
            "                  {",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"id\",",
            "                    \"ordinalPosition\" : 1",
            "                  }",
            "                ],",
            "                \"indexes\" : [",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"unique\" : true,",
            "                    \"name\" : \"PRIMARY\",",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"orderType\" : \"ASC\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"id\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"unique\" : false,",
            "                    \"name\" : \"image_uploader_to_user_id\",",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"orderType\" : \"ASC\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"uploader\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"columns\" : [",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"expanded\" : true,",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"nullable\" : false,",
            "                    \"autoIncrement\" : true,",
            "                    \"name\" : \"id\",",
            "                    \"nullableImplementation\" : \"OPTIONAL\",",
            "                    \"ordinalPosition\" : 1,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"expanded\" : true,",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"nullable\" : false,",
            "                    \"autoIncrement\" : false,",
            "                    \"name\" : \"uploader\",",
            "                    \"nullableImplementation\" : \"OPTIONAL\",",
            "                    \"ordinalPosition\" : 2,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"autoIncrement\" : false,",
            "                    \"name\" : \"title\",",
            "                    \"nullableImplementation\" : \"OPTIONAL\","
        ).forEachOrdered(sb::append);
    }
    
    private static void initPart1(StringBuilder sb) {
        Stream.of(
            "                    \"ordinalPosition\" : 3,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"description\",",
            "                    \"ordinalPosition\" : 4,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"img_data\",",
            "                    \"ordinalPosition\" : 5,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.sql.Timestamp\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"uploaded\",",
            "                    \"ordinalPosition\" : 6,",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"name\" : \"image\",",
            "                \"enabled\" : true",
            "              },",
            "              {",
            "                \"foreignKeys\" : [",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"foreignKeyColumns\" : [",
            "                      {",
            "                        \"foreignDatabaseName\" : \"db0\",",
            "                        \"foreignSchemaName\" : \"socialnetwork\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"follower\",",
            "                        \"foreignColumnName\" : \"id\",",
            "                        \"foreignTableName\" : \"user\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"name\" : \"follow_follower_to_user_id\",",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"foreignKeyColumns\" : [",
            "                      {",
            "                        \"foreignDatabaseName\" : \"db0\",",
            "                        \"foreignSchemaName\" : \"socialnetwork\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"follows\",",
            "                        \"foreignColumnName\" : \"id\",",
            "                        \"foreignTableName\" : \"user\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"name\" : \"follow_follows_to_user_id\",",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"expanded\" : true,",
            "                \"primaryKeyColumns\" : [",
            "                  {",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"follower\",",
            "                    \"ordinalPosition\" : 1",
            "                  },",
            "                  {",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"follows\",",
            "                    \"ordinalPosition\" : 2",
            "                  }",
            "                ],",
            "                \"indexes\" : [",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"unique\" : true,",
            "                    \"name\" : \"PRIMARY\",",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"orderType\" : \"ASC\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"follower\",",
            "                        \"ordinalPosition\" : 1",
            "                      },",
            "                      {",
            "                        \"orderType\" : \"ASC\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"follows\",",
            "                        \"ordinalPosition\" : 2",
            "                      }",
            "                    ],",
            "                    \"enabled\" : true",
            "                  },",
            "                  {"
        ).forEachOrdered(sb::append);
    }
    
    private static void initPart2(StringBuilder sb) {
        Stream.of(
            "                    \"expanded\" : false,",
            "                    \"unique\" : false,",
            "                    \"name\" : \"follow_follows_to_user_id\",",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"orderType\" : \"ASC\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"follows\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"columns\" : [",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"follower\",",
            "                    \"ordinalPosition\" : 1,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"follows\",",
            "                    \"ordinalPosition\" : 2,",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"name\" : \"link\",",
            "                \"enabled\" : true",
            "              },",
            "              {",
            "                \"expanded\" : true,",
            "                \"primaryKeyColumns\" : [",
            "                  {",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"id\",",
            "                    \"ordinalPosition\" : 1",
            "                  }",
            "                ],",
            "                \"indexes\" : [",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"unique\" : true,",
            "                    \"name\" : \"PRIMARY\",",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"orderType\" : \"ASC\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"id\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"columns\" : [",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"autoIncrement\" : true,",
            "                    \"name\" : \"id\",",
            "                    \"ordinalPosition\" : 1,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"mail\",",
            "                    \"ordinalPosition\" : 2,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"password\",",
            "                    \"ordinalPosition\" : 3,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"first_name\",",
            "                    \"ordinalPosition\" : 4,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,"
        ).forEachOrdered(sb::append);
    }
    
    private static void initPart3(StringBuilder sb) {
        Stream.of(
            "                    \"name\" : \"last_name\",",
            "                    \"ordinalPosition\" : 5,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"avatar\",",
            "                    \"ordinalPosition\" : 6,",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"name\" : \"user\",",
            "                \"enabled\" : true",
            "              }",
            "            ],",
            "            \"expanded\" : true,",
            "            \"name\" : \"socialnetwork\",",
            "            \"enabled\" : true",
            "          }",
            "        ],",
            "        \"typeName\" : \"MySQL\",",
            "        \"ipAddress\" : \"127.0.0.1\",",
            "        \"name\" : \"db0\",",
            "        \"enabled\" : true,",
            "        \"username\" : \"root\"",
            "      }",
            "    ],",
            "    \"enabled\" : true",
            "  }",
            "}"
        ).forEachOrdered(sb::append);
    }
}