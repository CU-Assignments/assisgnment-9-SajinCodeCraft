@Configuration
@EnableTransactionManagement
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String holderName;
    private Double balance;

    // Getters and setters
}
