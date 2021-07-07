@Entity public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String profissao;
    private String endereco;

    @JoinColumn(unique = true)
    @OneToOne
    private Conta conta;

