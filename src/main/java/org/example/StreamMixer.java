package org.example;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Iterator;


public class StreamMixer {


    Stream <String> mix(Stream<String> aStream, Stream<String> bStream){
        List<String> result =new ArrayList<>();

         Iterator<String> iteratora = aStream.iterator();
         Iterator<String> iteratorb = bStream.iterator();
         while(iteratora.hasNext()&& iteratorb.hasNext()){
             result.add(iteratora.next());
             result.add(iteratorb.next());
         }

         return result.stream();

    }
}




