import controller.AlunoController;

public class Main {
    public static void main(String[] args) {
        System.out.println("aqui");
        AlunoController controlle;;;r = new AlunoController();

        controller.createAluno("Antônio Junior",123456,51,"999999999",'R');
        controller.createAluno("Henrique Oliveira",23656,51,"999999999",'R');
        controller.createAluno("João Luis Silva",2017110129,51,"998601789",'C');
        controller.createAluno("Rafael Ribeiro",12345,51,"999999999",'R');
        controller.createAluno("Pedro Alves", 1234567, 51, "9999999991",'R');

        controller.listaAlunos();
    }
}
/*        for(boolean lanjut = true; lanjut; lanjut = Util.getYes("Você gostaria de continuar")) {
                Util.clearConsole();
                System.out.println("\nCadastro de Alunos\n");
                System.out.println("1.\tIncluir Aluno");
                System.out.println("2.\tAlterar Aluno");
                System.out.println("3.\tExcluir Aluno");
                System.out.println("4.\tListar Alunos");
                System.out.print("\nDigite uma opção : ");
                String inputUser = scan.nextLine();
                System.out.println("==============================================================");
                byte var4 = -1;
                switch(inputUser.hashCode()) {
                case 49:
                if (inputUser.equals("1")) {
                var4 = 0;
                }
                break;
                case 50:
                if (inputUser.equals("2")) {
                var4 = 1;
                }
                break;
                case 51:
                if (inputUser.equals("3")) {
                var4 = 2;
                }
                break;
                case 52:
                if (inputUser.equals("4")) {
                var4 = 3;
                }
                }

                switch(var4) {
                case 0:
                System.out.println("\t\t\t\t\tIncluir Aluno");
                System.out.println("==============================================================\n");
                Operasi.tampilData();
                break;
                case 1:
                System.out.println("\t\t\t\t\tAlterar Aluno");
                System.out.println("==============================================================\n");
                Operasi.getData();
                break;
                case 2:
                System.out.println("\t\t\t\t\tExcluir Aluno");
                System.out.println("==============================================================\n");
                Operasi.addData();
                break;
                case 3:
                System.out.println("\t\t\t\t\tListar Aluno");
                System.out.println("==============================================================\n");
                Operasi.editDataByKelasTerbuka();
                break;
default:
        System.out.println("A opção que você inseriu é inválida\nInsira as opções de [1-4]\n");
        }
        }

        }

static {
        scan = new Scanner(System.in);
        }
        }
*/