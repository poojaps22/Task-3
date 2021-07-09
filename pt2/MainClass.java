package pt2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		
		Map<String, List<ElectronicDevice>>  ed = new HashMap<>();
		
		ElectronicDevice e1 = new Computer(25000, 5);
		ElectronicDevice e2 = new Computer(35000, 8);
		ElectronicDevice e3 = new Computer(15000, 4);
		ElectronicDevice e4 = new Computer(10000, 3);
		
		List<ElectronicDevice> comList = new ArrayList<>();
		comList.add(e1);
		comList.add(e2);
		comList.add(e3);
		comList.add(e4);
		
		ElectronicDevice m1 = new Mobile(5000, 3);
		ElectronicDevice m2 = new Mobile(35000, 8);
		ElectronicDevice m3 = new Mobile(55000, 9);
		ElectronicDevice m4 = new Mobile(22000, 7);
		
		List<ElectronicDevice> mobList = new ArrayList<>();
		mobList.add(m1);
		mobList.add(m2);
		mobList.add(m3);
		mobList.add(m4);
		
		ElectronicDevice a1 = new Ac(55000, 7);
		ElectronicDevice a2 = new Ac(35000, 8);
		ElectronicDevice a3 = new Ac(65000, 6);
		ElectronicDevice a4 = new Ac(15000, 5);
		
		List<ElectronicDevice> acList = new ArrayList<>();
		acList.add(a1);
		acList.add(a2);
		acList.add(a3);
		acList.add(a4);
		
		ed.put("computer", comList);
		ed.put("mobile", mobList);
		ed.put("ac", acList);
		
		Iterator<String> itr = ed.keySet().iterator();
		
		System.out.println("--Rating---Price--");
		
		while(itr.hasNext())
		{
			
			String deviceName = itr.next();
			
			
			if(deviceName.equals("computer"))
			{
				List<ElectronicDevice> edevice = ed.get(deviceName);
				System.out.println("----Computer----");
				for (ElectronicDevice device : edevice) {
					if(device.getRating()>=5 && device.getRating()<=10)
					{
						System.out.println(device);
					}
				}
			}
			
			if(deviceName.equals("mobile"))
			{
				List<ElectronicDevice> edevice = ed.get(deviceName);
				System.out.println("----Mobile----");
				for (ElectronicDevice device : edevice) {
					if(device.getRating()>=5 && device.getRating()<=10)
					{
						System.out.println(device);
					}
				}
			}
			
			if(deviceName.equals("ac"))
			{
				List<ElectronicDevice> edevice = ed.get(deviceName);
				System.out.println("----AC----");
				for (ElectronicDevice device : edevice) {
					if(device.getRating()>=5 && device.getRating()<=10)
					{
						System.out.println(device);
					}
				}
			}
		}
		
	}
	
}