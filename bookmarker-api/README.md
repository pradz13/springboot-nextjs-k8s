Spring Boot Starter Project :
https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.0.2&packaging=jar&jvmVersion=17&groupId=com.pradipta&artifactId=bookmarker-api&name=bookmarker-api&description=Spring%20Boot%2C%20Next%20JS%20and%20K8S%20Learning&packageName=com.pradipta.bookmarker-api&dependencies=devtools,lombok,configuration-processor,web,actuator,testcontainers,data-jpa,flyway,h2,postgresql,validation

Level 1 : Creating the Bookmarks Find API with Pagination
--------------------------------------------------------
@RequiredArgsConstructor - Injects the dependency

Sequence can be generated as follows :
@Id
@SequenceGenerator(name = "bm_id_seq_gen", sequenceName = "bm_id_seq")
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bm_id_seq_gen")
private Long id;

If we are doing read only operations, we should use this annotation in Service class to improve
the Hibernate performance -
@Transactional(readOnly = true)

Following annotation can be added in the DTO to return custom field names
@JsonProperty("isFirst")
private boolean isFirst;
