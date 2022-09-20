package Ejercicio.Tema5.CocheCRUD;

public class Ejercicio5 {

    public interface CocheCRUD {
        void save();
        void findAll();
        void delete();
    }

    public static class CocheCRUDImpl implements CocheCRUD {

        @Override
        public void save() {

        }

        @Override
        public void findAll() {

        }

        @Override
        public void delete() {

        }

        String save = "guardar";
        String findAll = "Buscar todos";
        String delete = "borrar";

        @Override
        public String toString() {
            return "CocheCRUDImpl{" +
                    "save='" + save + '\'' +
                    ", findAll='" + findAll + '\'' +
                    ", delete='" + delete + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        CocheCRUD cocheCRUD = new CocheCRUDImpl();
        System.out.println(cocheCRUD);

    }
}
