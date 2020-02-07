package ba.edu.ssst;

public class Cat extends Mammal {
    Cat(String name,String breed) {
        super.name = name;
        super.breed = breed;
    }

    @Override
    public String showPicture() {
        return "MMMMMMMMMMMMMMMMMMMMMMMMMMWOodxkO0KXNWMMMMMMMMMMMWWNNNNNNWMMMMMMMMMMMMMNXKK0XWMM\n" +
                "MMMMMMMMMMMMMMMMMMMMMMMMMMXxllooodxkk0KXNNWNX0xdooloxOkxoodxkKNWWMWNKOkxxxxxkXMM\n" +
                "MMMMMMMMMMMMMMMMMMMMMMMMMMXdloxkdolodxkkkOOxollll:::lxOkdl:;:okkkOkdddxkxxxxkXMM\n" +
                "MMMMMMMMMMMMMMMMMMMMMMMMMMXxloxOOkxolodxxkkkxdkkkxoc:okkkxl::lkkocldxxxdxkOkkXMM\n" +
                "MMMMMMMMMMMMMMMMMMMMMMMMMMNxlldOOOOxdoloodxkkkkkkkkxlcxkkkxl:cxOkllkkdxkOOkxONMM\n" +
                "MMMMMMMMMMMMMMMMMMMMMMMMMMW0oloxOOOOxdololoxkkkkkkkkkdxkkkkxccxkkxdkkkkkOOxkKWMM\n" +
                "MMMMMMMMMMMMMMMMMMMMMMMMMMMXxllokOOOkxdllloxkkkkkkkkkkxolokkolkkkkkdldkkxxkKWMMM\n" +
                "MMMMMMMMMMMMMMMMMMMMMMMMMMMMKdloodxxxdollldkkkkkkkkkkkdoooxkxxkkkkkdllxkkOXWMMMM\n" +
                "MMMMMMMMMMMMMMMMMMMMMMMMMMMMWKdlolllllllloxkkkkkkkkkkkkkkkkkkkkkkkkkkkkkOKMMMMMM\n" +
                "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXdlllllllooxkkkkkkkkkkkkxxxxkkkkkkkkkxxxkkOKWMMMMM\n" +
                "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMKoclolloloxkkkkkkkkkkkkxdxxddkkkkkkkddxddkOXMMMMMM\n" +
                "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMk,';;:ccldkkkkkkkkkkkkxccx00kxkkkkkdco00kx0NMMMMMM\n" +
                "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMWx''''''',:cclloxkkkkkOd...'d0xkkkkOo..'oOkKWMMMMMM\n" +
                "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMk,,''''',:llodxkkkkkkkk:  .lkxOkkkkx,  :kkKWMMMMMM\n" +
                "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMM0ollccclldkkkkkkkkkkkkkkl;cdkkOOOOOOxc:okk0NMMMMMM\n" +
                "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNklllllllodxkkxodkkkkkO0KKKKXNX0O00O0K0KK00NMMMMMM\n" +
                "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXxllllcc:::cc:lxkkkk0XWWWWWWWWX0O00XWWWWWNWMMMMMM\n" +
                "MWNNNWMMMMMMMMMMMMMMMMMMMMMMMMMMNkc,''''''',cxkkkkOXWWWWNNWWWWNKXWWWWWWWWMMMMMMM\n" +
                "0dolodx0NWMMMMMMMMMMMMMMMMMMMMMMMWXxc,''',;cloddxxOKNWWWWNX0kkocoOXNNNWWMMMMMMMM\n" +
                "::::::;:lxXWMMMMMMMMMMMMMMMMMMMMMMMMWOl:cclllllloodkKNWWWWWKkdoddONNWWWMMMMMMMMM\n" +
                "c,;:::::::l0WMMMMMMMMMMMMMMMMMMMMMMMNx:clllllllllllldxO0KXNWNXXXNNNWMMMMMMMMMMMM\n" +
                "Xkc;,;:::::cOWMMMMMMMMMMMMMMMMMMMMMNd,'',,;:cllolllooddxkkO0XNNNWWMMMMMMMMMMMMMM\n" +
                "MMWKx:,;::::lKMMMMMMMMMMMMMMMMMMMMXd;'''''''',;:codxkkkkkkkk0NMMMMMMMMMMMMMMMMMM\n" +
                "MMMMMKc';::::kWMMMMMMMMMMMMMMMMMW0dllc:;;;,,,,;:cclodxkkkkkkk0NMMMMMMMMMMMMMMMMM\n" +
                "MMMMMWk;clclo0WMMMMMMMMMMMMMMMMXdccloloolllodxxxxkkkkkkkkkkxoo0MMMMMMMMMMMMMMMMM\n" +
                "MMMMMWOoxkkkkKMMMMMMMMMMMMMMMWKc'',;:llllodkkkkkkkkkkxdoolc:::OMMMMMMMMMMMMMMMMM\n" +
                "MMMMMWkoxkkkkXMMMMMMMMMMMMMMW0c'''''',;:clxkkkkkkkxxkkdoolllllOWWWWWWWWMMMMMMMMM\n" +
                "MMMMMNxokOOkONMMMMMMMMMMMMMW0olc;,''''',;:clloddxxddkkkkkkkkkk0WWWWWWNNNNWWWWWWW\n" +
                "MMMMMKlcoooo0WMMMMMMMMMMMMW0olololcc:;;clcccccccllldkkkkkkkxddKWWWWWWWNWWWWWWWWN\n" +
                "MMMMMO;,::::OMMMMMMMMMMMMMKc,:cllloolldkkkxxxxxkkxldkkdoolcc:cdxddxO0XNWWWWWWWMW\n" +
                "MMMMMO,;cloo0WMMMMMMMMMMMMk,.'',;:clloxkkkkkkkkkkdldkkkxdooolodl:;:okkOXWWWWWWWN\n" +
                "MMMMMOclxkkkkXMMMMMMMMMMMMk;,'''''',,;cdddxkkkkkkdldkkkkkkkkkxkko::okkkOXWWWWWWX\n" +
                "MMMMMXxdkkkdco0NMMMMMMMMMW0olc::;;,,,',:::ccloodxdldkkkkkkkkkkkkxlcdkkkk0WWWWWXK\n" +
                "MMMMMW0dxko::::oOKXNNNX0kdooooloollllcloddxxxxxkkdloxkkkOOO0KNX0OddkkkkkKWWWWXKN\n" +
                "MMMMMMW0dc::::ldxxxkkxl;,',clooloollollooodxxxxxxdlox0KXXNNWWWWWNOdddddx0XXXKKXW\n" +
                "MMMMMMMMXx:,,:dkkkkkkkd:;,'',:oollolllollooolllc:,:x0NWWWWWWWWWNWKdllodO0000XNMM\n" +
                "MMMMMMMMMMNOdodddxxkxxxl;';cdOXN0kdlccccc::;;,'''':x0KNWWWWNNWWXXKOkO0KXXXNWMMMM\n" +
                "MMMMMMMMMMMMMWXKOOOkkkkOO0XWMMMMMWN0xoc;,,'''',;:cloxOKXNNWXXNXXXWWMMMMMMMMMMMMM\n" +
                "ooooooooooooooooooooooooooooooooooooool:;;'...',,,,,,;cccccccclooooooooooooooooo";
    }

    @Override
    public String makeSound() {
        return "Meow!";
    }
}
