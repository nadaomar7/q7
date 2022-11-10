     import java.io.*;

        public class x {
            public static void main(String[] args) {

                try (
                        DataOutputStream y = new DataOutputStream(new FileOutputStream("filex.txt", true));
                ) {

                    for (int k = 0; k < 100; k++) {
                        y.writeInt((int)(Math.random() * 10));
                    }
                }
                catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }

