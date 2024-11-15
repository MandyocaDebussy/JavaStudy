public class obj {

    // Tornando MyObj uma classe estática interna
    static class MyObj {
        String none;
        int number;
        float altura;

        @Override
        public String toString() {
            return "Nome: " + none + ", Número: " + number + " Altura: " + altura;

        }

    }

    // objetos com seus atributos
    static void MyPessoa(String nome, int idade) { // void retorna sem valor.
        System.out.println(nome + " " + idade); // minhas declaracoes
    }

    // metodos
    public static void main(String[] args) {
        MyPessoa("meu nome é amanda e eu tenho", 28);

        MyObj obj = new MyObj();
        obj.none = "Amanda";
        obj.number = 28;
        obj.altura = 1.59f;

        System.out.println(obj.toString());

    }

}
