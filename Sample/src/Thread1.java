import java.util.*;

 public class Thread1 {
 private List names = new ArrayList();
 public synchronized void add(String name) { 
	 names.add(name); 
	 System.out.println("nitin-------"+name);
 }
 public synchronized void printAll() {
 for (int i = 0; i <names.size(); i++) {
 System.out.print(names.get(i) +"");
 }
 }
 public static void main(String[] args) {
 final Thread1 sl = new Thread1();
for(int i=0;i<2;i++) {
 new Thread() {
 public void run() {
 sl.add("a");
 sl.add("b");
 sl.add("c");
 sl.printAll();
 }
 }.start();
 }
 }
 }
