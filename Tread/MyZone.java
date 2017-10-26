package chapter4;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * Created by Solidbeans on 2017-01-19.
 */
public class MyZone {

    public static void main(String[] args){
        ZonedDateTime myZoneDateTime = ZonedDateTime.now();
        ZoneId myZone = myZoneDateTime.getZone();
        Set<String> allZones = ZoneId.getAvailableZoneIds();
        List<String> zoneList = new ArrayList<String>(allZones);
        Collections.sort(zoneList);

        LocalDateTime dt = LocalDateTime.now();
        for (String s : zoneList) {
            ZoneId zone = ZoneId.of(s);
      //      if(zone.equals(myZone)) {
                ZonedDateTime zdt = dt.atZone(zone);
                ZoneOffset offset = zdt.getOffset();
                String out = String.format("%5s %10s%n", zone, offset);
                System.out.println(out);
        //    }
        }

    }
}
