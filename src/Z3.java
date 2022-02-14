import java.io.File;
import java.io.FileFilter;


public class Z3 {
    public static void main(String[] args){
        sortuj("D:\\Anime\\BNHA");



    }

    public static String sortuj(String path){
        String cos = "";
        File f = new File(path);
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory())
                {
                    return true;
                }
                return false;

            }
        };
        File[] files = f.listFiles(filter);

        for (File d : files){
            System.out.println(d.getName());

        }
        return cos;
    }

}
