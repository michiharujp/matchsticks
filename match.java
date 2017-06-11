import java.io.*;
    class match{
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
            System.out.print("Enter the number of matchi (larger than 10):");
            int matchi = Integer.parseInt(reader.readLine());
            if(matchi<10){
                System.out.println("too small!!");
                return;
            }

            System.out.print("how many matchi we can get everytime:");
            int toru = Integer.parseInt(reader.readLine());

            if(toru>=matchi){
                System.out.println("too big!!");
                return;
            }

            System.out.println("Let's janken!");
            System.out.print("guu=0 choki=1 paa=2:");
            int janken = Integer.parseInt(reader.readLine());

            System.out.print("I choosed ");
            if(matchi%(toru+1)==1){
                tenohira((janken+1)%3);
                System.out.println("I lost. you go first");
                matchies(matchi);
                while(matchi>0){
                    System.out.print("How many matchi do you want?:");
                    int toreta = Integer.parseInt(reader.readLine());
                    if(toreta>toru){
                        System.out.println("you can't get so many matchies!");
                        continue;
                    }
                    matchi-=toreta;
                    matchies(matchi);
                    if(matchi<1){
                        break;
                    }
                    int totta=toru+1-toreta;
                    System.out.println("I took " + totta + "matchies");
                    matchi-=totta;
                    matchies(matchi);
                }
            }

            else{
                tenohira((janken+2)%3);
                System.out.println("I won. I go first");
                int saisyo=(matchi-1)%(toru+1);
                System.out.println("I took " + saisyo + " matchies");
                    matchi-=saisyo;
                    matchies(matchi);
                while(matchi>0){
                    System.out.print("How many matchi do you want?:");
                    int toreta = Integer.parseInt(reader.readLine());
                    if(toreta>toru){
                        System.out.println("you can't get so many matchies!");
                        continue;
                    }
                    matchi-=toreta;
                    matchies(matchi);
                    if(matchi<1){
                        break;
                    }
                    int totta=toru+1-toreta;
                    System.out.println("I took " + totta + " matchies");
                    matchi-=totta;
                    matchies(matchi);
                }
            }
                    System.out.println("I won!");
        }

        public static void tenohira(int n){
            switch(n){
                case 0:
                    System.out.println("guu");
                    break;
                case 1:
                    System.out.println("choki");
                    break;
                case 2:
                    System.out.println("paa");
                    break;
                default:
                    System.out.println("muteki!");
                    break;
            }
        }

        public static void matchies(int n){
            for(int i=1; i<=n; i++){
                System.out.print(i +" ");
                }
                System.out.println("");
        }
    }
