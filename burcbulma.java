import java.util.Scanner;
public class burcbulma {
    public static void main(String[] args) {
        int month, day;


        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay : ");
        month = input.nextInt();
        if ((month <= 12) && (month >= 1)) {

           System.out.print("Doğduğunuz Gün : ");
           day = input.nextInt();

            if (day >= 1) {


                if (month == 1) {
                    if (day <= 31) {
                        if (day < 22) {
                            System.out.println("Oğlak Burcu");
                        } else {
                            System.out.println("Kova Burcu");
                        }
                    } else {
                        System.out.println("Ocak ayında öyle bir gün yok");
                    }
                } else if (month == 2) {
                    if (day <= 28) {
                        if (day < 20) {
                            System.out.println("Kova Burcu");
                        } else {
                            System.out.println("Balık Burcu");
                        }
                    } else {
                        System.out.println("Şubat ayında öyle bir gün yok");
                    }


                } else if (month == 3) {
                    if (day <= 31) {
                        if (day < 21) {
                            System.out.println("Balık Burcu");
                        } else {
                            System.out.println("Koç Burcu");
                        }
                    } else {
                        System.out.println("Mart ayında öyle bir gün yok");
                    }
                } else if (month == 4) {
                    if (day <= 30) {
                        if (day < 21) {
                            System.out.println("Koç Burcu");
                        } else {
                            System.out.println("Boğa Burcu");
                        }
                    } else {
                        System.out.println("Nisan ayında öyle bir gün yok");
                    }
                } else if (month == 5) {
                    if (day <= 31) {
                        if (day < 22) {
                            System.out.println("Boğa Burcu");
                        } else {
                            System.out.println("İkizler Burcu");
                        }
                    } else {
                        System.out.println("Mayıs ayında öyle bir gün yok");
                    }
                } else if (month == 6) {
                    if (day <= 30) {
                        if (day < 23) {
                            System.out.println("ikizler Burcu");
                        } else {
                            System.out.println("Yengeç Burcu");
                        }
                    } else {
                        System.out.println("Haziran ayında öyle bir gün yok");
                    }
                } else if (month == 7) {
                    if (day <= 31) {
                        if (day < 23) {
                            System.out.println("Yengeç Burcu");
                        } else {
                            System.out.println("Aslan Burcu");
                        }
                    } else {
                        System.out.println("Temmuz ayında öyle bir gün yok");
                    }
                } else if (month == 8) {
                    if (day <= 31) {
                        if (day < 23) {
                            System.out.println("Aslan Burcu");
                        } else {
                            System.out.println("Başak Burcu");
                        }
                    } else {
                        System.out.println("Ağustos ayında öyle bir gün yok");
                    }
                } else if (month == 9) {
                    if (day <= 30) {
                        if (day < 23) {
                            System.out.println("Başak Burcu");
                        } else {
                            System.out.println("Terazi Burcu");
                        }
                    } else {
                        System.out.println("Eylül ayında öyle bir gün yok");
                    }

                } else if (month == 10) {
                    if (day <= 31) {
                        if (day < 23) {
                            System.out.println("Terazi Burcu");
                        } else {
                            System.out.println("Akrep Burcu");
                        }
                    } else {
                        System.out.println("Ekim ayında öyle bir gün yok");

                    }
                }else if (month == 11) {
                        if (day <= 30) {
                            if (day < 22) {
                                System.out.println("Akrep Burcu");
                            } else {
                                System.out.println("Yay Burcu");
                            }
                        } else {
                            System.out.println("Kasım ayında öyle bir gün yok");

                        }
                    } else if (month == 12) {
                        if (day <= 31) {
                            if (day < 22) {
                                System.out.println("Yay Burcu");
                            } else {
                                System.out.println("Oğlak Burcu");
                            }
                        } else {
                            System.out.println("Aralık ayında öyle bir gün yok");

                        }
                    }
                }else{
                System.out.println("aylar 1.günden başlar");
            }
            } else {
                System.out.println("toplam 12 ay vardır");
            }
        }
    }






