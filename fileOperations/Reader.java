package fileOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Reader {

    public static void main(String[] args) throws IOException {
        String lpocation="c:\\myfile1.csv";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        lpocation=br.readLine();
        List<Map<Integer,String>> list=new ArrayList<>();
        try(BufferedReader str=Files.newBufferedReader(Paths.get(lpocation))) {
            IdentityObject ido=new IdentityObject();
            Map<Integer,String> map=new LinkedHashMap<>();
            while((lpocation=str.readLine())!=null) {
                String[] val=lpocation.split(",");
                map.put(Integer.parseInt(val[0]),val[1]);
                list.add(map);
                int x=Integer.parseInt(val[0])&(val[1]).toCharArray().hashCode();//&val[1];
                System.out.println(x);
            }
            //forEach((x,y)->System.out.println(x+"# "+y));
            Charset charset = Charset.forName("UTF-8");
            try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("c:\\newfile.csv"), charset, StandardOpenOption.APPEND)) {
               for(Map<Integer,String> obj:list) {}
                /*writer.write(obj);*/
            } catch (IOException e) {
                System.err.println(e);
            }
            /*Map<String, Integer> map=str.collect(Collectors.toMap(IdentityObject::getId, IdentityObject::getStr));
            map.forEach((k,v)->System.out.print(k+" "+v));*/
        } catch (NoSuchFileException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
