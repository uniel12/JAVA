package controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class gameController {
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	int index = 0;
	Mp3 m = new Mp3();


	public void ddak() throws InterruptedException {
		while (true) {

			int fail = 0; // 실패했을때 +1 씩 해줄 변수

			while (true) {
				Thread.sleep(3000);
				System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀"
						+ "\n                                                                "
						+ "\n            집중을 해서 딱지를 치세요!  \n\t     >> g + enter <<"
						+ "\n                                                                \n"
						+ "▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀ ");
				String ddak = sc.next();

				int num = rd.nextInt(10) + 1;
				System.out.println(" ☘☘☘☘☘☘ 당신의 파워 : " + num + "☘☘☘☘☘☘ ");

				if (num > 2) {
					System.out.println(""
							+ "  ______   __    __   ______    ______   ________   ______    ______   __ \r\n"
							+ " /      \\ /  |  /  | /      \\  /      \\ /        | /      \\  /      \\ /  |\r\n"
							+ "/$$$$$$  |$$ |  $$ |/$$$$$$  |/$$$$$$  |$$$$$$$$/ /$$$$$$  |/$$$$$$  |$$ |\r\n"
							+ "$$ \\__$$/ $$ |  $$ |$$ |  $$/ $$ |  $$/ $$ |__    $$ \\__$$/ $$ \\__$$/ $$ |\r\n"
							+ "$$      \\ $$ |  $$ |$$ |      $$ |      $$    |   $$      \\ $$      \\ $$ |\r\n"
							+ " $$$$$$  |$$ |  $$ |$$ |   __ $$ |   __ $$$$$/     $$$$$$  | $$$$$$  |$$/ \r\n"
							+ "/  \\__$$ |$$ \\__$$ |$$ \\__/  |$$ \\__/  |$$ |_____ /  \\__$$ |/  \\__$$ | __ \r\n"
							+ "$$    $$/ $$    $$/ $$    $$/ $$    $$/ $$       |$$    $$/ $$    $$/ /  |\r\n"
							+ " $$$$$$/   $$$$$$/   $$$$$$/   $$$$$$/  $$$$$$$$/  $$$$$$/   $$$$$$/  $$/ \r\n"
							+ "                                                                          \n\n\n\n");
					m.fx(6);
					Thread.sleep(1000);
					System.out.println("                                =@%-                        \r\n"
							+ "                                @@@@#:                      \r\n"
							+ "                               ##+# *@%:                    \r\n"
							+ "                              :@. @: .*@*                   \r\n"
							+ "                              @*  @:   =#@-.                \r\n"
							+ "                             *%   -*     .@@=               \r\n"
							+ "                            .%=   :@       =@+-             \r\n"
							+ "                            :@    :@         #@@            \r\n"
							+ "                            @:     ##         .*@+          \r\n"
							+ "                           ##      ##           :@@:        \r\n"
							+ "                          :@-      .%.            =%%=      \r\n"
							+ "                          @=        @:              -@#     \r\n"
							+ "      @*@@@@@@@@@@@@@@@@@@@@@@*@    +-              =%@*    \r\n"
							+ "      @:                      :@    :@          ..@@%@@:    \r\n"
							+ "      @:               ==     :@    :@       +*@@*-- ##     \r\n"
							+ "      @:     .@@+.     ##     :@     #+ ..-@@%%:    :@      \r\n"
							+ "      @:    #@--+@+    ##     :@     #@*@@*-:       #=      \r\n"
							+ "      @:   #@:   +%    ##     :@ ::%@%@%           +@:      \r\n"
							+ "      @:   #:     @:   ##     :@#@@=:.@:          :@=       \r\n"
							+ "      @:  .%      #:   #@@@:  :@+     %:          =%        \r\n"
							+ "      @:   #+     @:   #%::   :@      -%          @:        \r\n"
							+ "      @:   +%    :@.   ##     :@      :@         ##         \r\n"
							+ "      @:    %%%%%@.    ##     :@       #.       :@.         \r\n"
							+ "      @:     =***.     ##     :@       ##       *#          \r\n"
							+ "      @:               #.     :@       ##      *@.          \r\n"
							+ "      @:     #@@@@@@@@@@@:    :@        @:    .%=           \r\n"
							+ "      @:       #%.   ##       :@        @:    :@            \r\n"
							+ "      @:       #%    ##       :@-       +*    @:            \r\n"
							+ "      @:       #%    ##       :@@@      :@   ##             \r\n"
							+ "      @:       #%    ##       :@.=@*-   .%  .%-             \r\n"
							+ "      @:     #@@@@@@@@@@@:    :@   #@-   ## %%              \r\n"
							+ "      @:     -===========.    :@    -%%+ ##=%.              \r\n"
							+ "      @:                      :@      :%@-%%*               \r\n"
							+ "      @:                      :@        +@@@                \r\n"
							+ "      @:                      :@          %:                \r\n"
							+ "      @:    h a n d m a d e   :@                            \r\n"
							+ "      @@@@@@@@@@@@@@@@@@@@@@@@@@                            \r\n"
							+ "      .:::::::::::::::::::::::::         ");

					Thread.sleep(2000);
					System.out.println("10만원 드릴게요");
					Thread.sleep(2000);
					System.out.println("하지만 이런 푼돈에 만족하실건가요?");
					Thread.sleep(4000);
					System.out.println("==================================================\r\n"
							+ "==================================================\r\n"
							+ "==========명                           함===========\r\n"
							+ "=========================-========================\r\n"
							+ "==================================================\r\n"
							+ "==========%%%%===========*=======+%%%%%@%@@=======\r\n"
							+ "========*%#++%%+========%%=====-==@++++++*%=======\r\n"
							+ "==-=====@*====*%=======+%%#======+@======+%=======\r\n"
							+ "====-==*%=====-%+======%*+%=======@======+%=======\r\n"
							+ "===-===%#======%*=====*%==#%=====+%======+%=======\r\n"
							+ "=--====*@======@+=====@+===%+=====%======+@=======\r\n"
							+ "========@+====*%=====%%====+%====+%======+%=======\r\n"
							+ "========*@*==*@*=====%%%@@%@@#===+%======+%=======\r\n"
							+ "=========+%@@%+=====**********===+@@@@@@@@%=======\r\n"
							+ "==-===============================================\r\n"
							+ "=================================-================\r\n"
							+ "==================================================\r\n"
							+ "==============-==============-====================");

					Thread.sleep(1500);
					System.out.println("이번에는 싸다구 말고... 목숨을 건 게임 어떠십니까?");
					Thread.sleep(1500);
					System.out.println("상금은 4억 5천입니다");
					Thread.sleep(4000);
					System.out.println("4억 5천..?\n엄마와 평생 놀고 먹고 살 수있는돈이다.");
					Thread.sleep(4000);
					System.out.println("잠시 고민을 한후.... 할게요...하겠습니다...! ");

					Thread.sleep(2500);
					System.out.println("그 후, 나는 영문모를 승합차에 탑승하여 어떠한 장소로 이동했다. ");
					m.fx(10);

					break;
				} else {
					System.out.println("" + " ________  ______   ______  __                   \r\n"
							+ "/        |/      \\ /      |/  |                  \r\n"
							+ "$$$$$$$$//$$$$$$  |$$$$$$/ $$ |                  \r\n"
							+ "$$ |__   $$ |__$$ |  $$ |  $$ |                  \r\n"
							+ "$$    |  $$    $$ |  $$ |  $$ |                  \r\n"
							+ "$$$$$/   $$$$$$$$ |  $$ |  $$ |                  \r\n"
							+ "$$ |     $$ |  $$ | _$$ |_ $$ |_____  __  __  __ \r\n"
							+ "$$ |     $$ |  $$ |/ $$   |$$       |/  |/  |/  |\r\n"
							+ "$$/      $$/   $$/ $$$$$$/ $$$$$$$$/ $$/ $$/ $$/ \r\n"
							+ "                                                 ");
					m.fx(5);
					System.out.println("                                .@+:                          \r\n"
							+ "                              #=@@=                         \r\n"
							+ "                             :%.+ %@.                       \r\n"
							+ "                             #:.@  -**=                     \r\n"
							+ "                            *#  *    +@%                    \r\n"
							+ "                           :@-  *%    .=@+                  \r\n"
							+ "                           -@   .@       *@=                \r\n"
							+ "                           %.    @:       .#@-              \r\n"
							+ "                          %*     @=          @@             \r\n"
							+ "                         :@       =           +#+-          \r\n"
							+ "        #%%%%%%%%%%%%%%%%@@%%%:   @             *@:         \r\n"
							+ "        %#*:::::::::::::::::#@:   %          :-+@@:         \r\n"
							+ "        % #*               +@@:   +=      .%%@@:-#          \r\n"
							+ "        %  #+             =%.@:   =@  ::@%##   .%+          \r\n"
							+ "        %   #*           +@. @:    @##@=:.     -@           \r\n"
							+ "        %    %+         =@   @=:*@%@+          @.           \r\n"
							+ "        %     **       +@.   @@%-- -+         **            \r\n"
							+ "        %      %*     -@     @:     *         @             \r\n"
							+ "        %       **   =@.     @:     @.       +=             \r\n"
							+ "        %        %# -@       @:     =.      .@              \r\n"
							+ "        %         **%.       @:     =#      @+              \r\n"
							+ "        %         -@#        @:     :@     +@               \r\n"
							+ "        %        =%.**       @:      %-    #.               \r\n"
							+ "        %       =@   #%      @:      %*   .=                \r\n"
							+ "        %      =%     **     @@=.     *  .@:                \r\n"
							+ "        %     =@       *%    @--@#    @: *%                 \r\n"
							+ "        %    -%         **   @: .#@-  #::@                  \r\n"
							+ "        %   +@.          +%  @:   :@%.-:%=                  \r\n"
							+ "        %  =%             *# @:     -#@@#                   \r\n"
							+ "        % +%.              +#@:       +@:                   \r\n"
							+ "        %=%                 *@:                             \r\n"
							+ "        %@@@@@@@@@@@@@@@@@@@@@:                             \n\n\n\n");
				}

			}
			break;
		}
	}

	public void mugung() throws InterruptedException {
		m.stp(5);
		m.stp(6);
		String arr[] = new String[16];
		int cnt = 0;
		String click = "";
		int dcnt = 0;

		arr[15] = "▣";

		System.out.println("@@@@@@@@@@@@*%%%%%%%%###***##++*+**+@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@#%%%%%%%%%########*****+@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@#%%%%%%%%%###%#####****+#@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@*%%%%%%%%%%%%%%%%%#####*=@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@*%%%%%%%%%%%%%%%%%%#####=.@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@%%%%%%%%%%%%%%%%%%%####*:@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@%%%%%%%%%%%%%%%%%%%%####@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@%%%%%%%%%%%%%%%%%%%#%#+:@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@##@%%%%%%%%%%%%%%%%%#++=@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@%%%%%%%%%%%%%%%%%%#-@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@*#%%%%%%%%%%%%%%%*#@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@*****####**####**=+#@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@+******++==+**+++-:@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@#*****+-:. .=+*++-:@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@ :****#+-..    -*+=-@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@:.-****#-.....   -+=-@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@::::**+=:....     ..::@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@+ ::-+++=....:----:..  ..---:#@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@- ...:---------:::::::--------:-@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@=.    .-------------------------::  -@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@   .....:=--------------==------::::.   :@@@@@@@@@@@@@@@@@\r\n"
				+ "@.  .::...-+==--------::--===----:::-::    :@@@@@@@@@@@@@@@@\r\n"
				+ ". ..::--::=+===------:::--===----::.:--..  .@@@@@@@@@@@@@@@@\r\n"
				+ "=++++*******#*++===------=====---:::--=-:.   .:@@@@@@@@@@@@@\r\n"
				+ "=+*++*******#*++====-----======-------+-:..   .@@@@@@@@@@@@@\r\n"
				+ "=++*++++++=##*++====-----========-----+=:..   :@@@@@@@@@@@@@\r\n"
				+ "@@=++++==@@**#*++====---==========----*=:..    @@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@##*++=================-=--*=:..    .@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@##**+==========+==========*-:..     .@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@##**++=====-==============+=:::....  @@@@@@@@@@@\r\n");
		System.out.println("☘☘☘음악이 나오는 동안 g를 눌러 전진/음악이 안나오는 동안 h를 눌러 멈추세요☘☘☘");
		loop: while (true) {
			long startTime = System.currentTimeMillis();
			// while 문 바깥에서 배열의 길이를 선언
			// 게임 진행 정해진 길이만큼 다다랐을때, 혹은 2번 반복문에서 죽었을 때,
			// 무궁화 꽃이 피었습니다 재생 시간 5초 음악이 들릴 떄만 g키를 눌러 전진 할 수 있다(연타 가능) 5초동안 반복가능 정해진 배열의
			// 크기만큼 눌렀으면 탈출
			// 음악이 끝난 뒤 또는 음악 정지 시 키를 누르면 오버 3초동안 반복

			index = 1;
			Thread.sleep(1000);
			System.out.println("무궁화 꽃이 피었습니다.");
			System.out.println("☘☘☘음악이 나오는 동안 g를 눌러 전진/음악이 안나오는 동안 h를 눌러 멈추세요☘☘☘");

			m.fx(1);
	
			while (true) {
				long elapsedTime = System.currentTimeMillis() - startTime;

				for (int i = 0; i < arr.length - 1; i++) {
					arr[i] = "□";
				}

				click = sc.next();


				if (click.equals("g")) {
					arr[cnt] = "●";
					cnt++;
					
					for (int i = 0; i < arr.length; i++) {
						System.out.print(arr[i]);
					}
				}

				System.out.println();
				if (elapsedTime >= 5000) {
					System.out.println("#+*###%%%+===----::::::-----------:::::::::::::::::::::...:::::+%%###@\r\n"
							+ "##**##%%#+===----:::::::-----------::::::::::::::::::::::::::::-*-:==@\r\n"
							+ "*##%%%%++++=====-------===+++++===---::::::---=======-----:::::::+%%#@\r\n"
							+ "#%####%++++++===--------===++*+++==--:::::---======------::::::::+%##@\r\n"
							+ "*#####%++++++===-----:::--==++**++=--:::::---=====------:::::::::+%##@\r\n"
							+ "#*####%++++++===+*****+=-:-=++**++=--:::::----==--=******+=--::::+%##@\r\n"
							+ "###***#+++++++**#%%####**=:-=++*++=-::..:::-----=**--:::-*#*=-:::=##@@\r\n"
							+ "%#*#***+++++*##%#*-=##*#*#*:-=++++=-::...::----=*=:.*+==:.:##=:::=*#@@\r\n"
							+ "*######++++*###+-:-##*+.=+##--++++=-::...:::::=+-::*#*+=*-.:##=::-*#@@\r\n"
							+ "###%###+++=+##+=-:####***#+#*-=++==-::....:::-+=-::###**%#-:=#=::-+#@@\r\n"
							+ "%##%%%#++===+++=--%%%#%%%%.##+====--::......:=*=-:+%%%%%%%=:==::::-*@@\r\n"
							+ "%##%%%#++=------=-%%#*#%%#:++==-==--::......:====-=%%#+%%*-::.:.:::@@@\r\n"
							+ "%%%%###++=----::-:=###%%=-::::------::.......:::--:*#*-==-:....::::@@@\r\n"
							+ "@%%%%##++==-----::::----:...:----==--:........:::::---::........:::@@@\r\n"
							+ "@@%%%%%++=------::::.....::::----==--:.........:::::::::.......::::@@@\r\n"
							+ "@@@@%%*++===----::::::::::::::--====-::::::......:...........::::::::@\r\n"
							+ "@@@@@%+++===-----:::::::::::::-====--:::::::.::::::..........::::::::@\r\n"
							+ "@@@@@@+++===-----:::::::::::::-=====-::::::::::::::.........:::::::::@\r\n"
							+ "@@@@@+++====------::::::::::::=++===--::::::::::::::.......::::::::::@\r\n"
							+ "@@@@@+++====-------:::::::::::=+++====--::::::::::::.....:::::::::::::\r\n"
							+ "@@@@@+++====--------:::::::::-+++++++===---::::::::::....:::::::::::::\r\n"
							+ "@@@@@*++====--------:::::::::=+******++=+++-::::::::::..::::::::::::::\r\n"
							+ "@@@@@*++=====--------:::::::-++*+*##*++===+-::::::::::::::::::::::::::\r\n"
							+ "@@@@+*+++======-------::::::-=+++=**++=-:---:::::::::::::::::::::::::-\r\n"
							+ "@@@@***+++++========---------===========--:-:-------------------------");
					break;
				}

				if(cnt==15) {
					break;
				}
			}

			if (cnt == 15) {
				m.stp(1);
				System.out.println("" + " __        ______  __     __  ________ \r\n"
						+ "/  |      /      |/  |   /  |/        |\r\n" + "$$ |      $$$$$$/ $$ |   $$ |$$$$$$$$/ \r\n"
						+ "$$ |        $$ |  $$ |   $$ |$$ |__    \r\n" + "$$ |        $$ |  $$  \\ /$$/ $$    |   \r\n"
						+ "$$ |        $$ |   $$  /$$/  $$$$$/    \r\n" + "$$ |_____  _$$ |_   $$ $$/   $$ |_____ \r\n"
						+ "$$       |/ $$   |   $$$/    $$       |\r\n" + "$$$$$$$$/ $$$$$$/     $/     $$$$$$$$/ \r\n"
						+ "                                       ");

				break loop;
			}

			while (true) {
				long elapsedTime = System.currentTimeMillis() - startTime;

				click = sc.next();
				if (click.equals("g")) {
					dcnt++;
				}
				if (elapsedTime >= 2000) {
					break;
				}
			}
			
			if(dcnt>0) {
				break;
			}
			
		}

		if (dcnt > 0) {
			System.out.println("" + "▓█████▄ ▓█████ ▄▄▄     ▄▄▄█████▓ ██░ ██ \r\n"
					+ "▒██▀ ██▌▓█   ▀▒████▄   ▓  ██▒ ▓▒▓██░ ██▒\r\n" + "░██   █▌▒███  ▒██  ▀█▄ ▒ ▓██░ ▒░▒██▀▀██░\r\n"
					+ "░▓█▄   ▌▒▓█  ▄░██▄▄▄▄██░ ▓██▓ ░ ░▓█ ░██ \r\n" + "░▒████▓ ░▒████▒▓█   ▓██▒ ▒██▒ ░ ░▓█▒░██▓\r\n"
					+ " ▒▒▓  ▒ ░░ ▒░ ░▒▒   ▓▒█░ ▒ ░░    ▒ ░░▒░▒\r\n" + " ░ ▒  ▒  ░ ░  ░ ▒   ▒▒ ░   ░     ▒ ░▒░ ░\r\n"
					+ " ░ ░  ░    ░    ░   ▒    ░       ░  ░░ ░\r\n" + "   ░       ░  ░     ░  ░         ░  ░  ░\r\n"
					+ " ░                                      ");
			System.exit(0);

		}

	}

	public void dal() {
		ArrayList<String> dallist = new ArrayList<String>();

		dallist.add("w");
		dallist.add("w");
		dallist.add("w");
		dallist.add("w");
		dallist.add("w");
		dallist.add("d");
		dallist.add("d");
		dallist.add("d");
		dallist.add("d");
		dallist.add("d");
		dallist.add("s");
		dallist.add("s");
		dallist.add("s");
		dallist.add("s");
		dallist.add("s");
		dallist.add("a");
		dallist.add("a");
		dallist.add("a");
		dallist.add("a");

		int z = 0;
		while (true) {

			System.out.println("w(↑),a(←),s(↓),d(→) 방향키를 움직여서 한바퀴 완주하세요 (w 를 눌러 시작");
			String input = sc.next();
			m.fx(4);
			if (input.equals(dallist.get(z))) {

				if (z == 0) {
					System.out.println(".........");
					System.out.println(":┎─────┒:");
					System.out.println(":┃/////┃:");
					System.out.println(":┃/////┃:");
					System.out.println("●┖─────┚:");
					System.out.println("¨¨¨¨¨¨¨¨¨");
				} else if (z == 1) {
					System.out.println(".........");
					System.out.println(":┎─────┒:");
					System.out.println(":┃/////┃:");
					System.out.println("●┃/////┃:");
					System.out.println(" ┖─────┚:");
					System.out.println("¨¨¨¨¨¨¨¨¨");
				} else if (z == 2) {
					System.out.println(".........");
					System.out.println(":┎─────┒:");
					System.out.println("●┃/////┃:");
					System.out.println(" ┃/////┃:");
					System.out.println(" ┖─────┚:");
					System.out.println("¨¨¨¨¨¨¨¨¨");
				} else if (z == 3) {
					System.out.println(".........");
					System.out.println("●┎─────┒:");
					System.out.println(" ┃/////┃:");
					System.out.println(" ┃/////┃:");
					System.out.println(" ┖─────┚:");
					System.out.println("¨¨¨¨¨¨¨¨¨");
				} else if (z == 4) {
					System.out.println("●........");
					System.out.println(" ┎─────┒:");
					System.out.println(" ┃/////┃:");
					System.out.println(" ┃/////┃:");
					System.out.println(" ┖─────┚:");
					System.out.println("¨¨¨¨¨¨¨¨¨");
				} else if (z == 5) {
					System.out.println("  ●......");
					System.out.println(" ┎─────┒:");
					System.out.println(" ┃/////┃:");
					System.out.println(" ┃/////┃:");
					System.out.println(" ┖─────┚:");
					System.out.println("¨¨¨¨¨¨¨¨¨");
				} else if (z == 6) {
					System.out.println("    ●....");
					System.out.println(" ┎─────┒:");
					System.out.println(" ┃/////┃:");
					System.out.println(" ┃/////┃:");
					System.out.println(" ┖─────┚:");
					System.out.println("¨¨¨¨¨¨¨¨¨");
				} else if (z == 7) {
					System.out.println("     ●...");
					System.out.println(" ┎─────┒:");
					System.out.println(" ┃/////┃:");
					System.out.println(" ┃/////┃:");
					System.out.println(" ┖─────┚:");
					System.out.println("¨¨¨¨¨¨¨¨¨");
				} else if (z == 8) {
					System.out.println("      ●..");
					System.out.println(" ┎─────┒:");
					System.out.println(" ┃/////┃:");
					System.out.println(" ┃/////┃:");
					System.out.println(" ┖─────┚:");
					System.out.println("¨¨¨¨¨¨¨¨¨");
				} else if (z == 9) {
					System.out.println("        ●");
					System.out.println(" ┎─────┒:");
					System.out.println(" ┃/////┃:");
					System.out.println(" ┃/////┃:");
					System.out.println(" ┖─────┚:");
					System.out.println("¨¨¨¨¨¨¨¨¨");
				} else if (z == 10) {
					System.out.println("         ");
					System.out.println(" ┎─────┒●");
					System.out.println(" ┃/////┃:");
					System.out.println(" ┃/////┃:");
					System.out.println(" ┖─────┚:");
					System.out.println("¨¨¨¨¨¨¨¨¨");
				} else if (z == 11) {
					System.out.println("         ");
					System.out.println(" ┎─────┒ ");
					System.out.println(" ┃/////┃●");
					System.out.println(" ┃/////┃:");
					System.out.println(" ┖─────┚:");
					System.out.println("¨¨¨¨¨¨¨¨¨");
				} else if (z == 12) {
					System.out.println("         ");
					System.out.println(" ┎─────┒ ");
					System.out.println(" ┃/////┃");
					System.out.println(" ┃/////┃●");
					System.out.println(" ┖─────┚:");
					System.out.println("¨¨¨¨¨¨¨¨¨");
				} else if (z == 13) {
					System.out.println("         ");
					System.out.println(" ┎─────┒ ");
					System.out.println(" ┃/////┃ ");
					System.out.println(" ┃/////┃ ");
					System.out.println(" ┖─────┚●");
					System.out.println("¨¨¨¨¨¨¨¨¨");
				} else if (z == 14) {
					System.out.println("         ");
					System.out.println(" ┎─────┒ ");
					System.out.println(" ┃/////┃ ");
					System.out.println(" ┃/////┃ ");
					System.out.println(" ┖─────┚ ");
					System.out.println("¨¨¨¨¨¨¨¨●");

				} else if (z == 15) {
					System.out.println("         ");
					System.out.println(" ┎─────┒ ");
					System.out.println(" ┃/////┃ ");
					System.out.println(" ┃/////┃ ");
					System.out.println(" ┖─────┚ ");
					System.out.println("¨¨¨¨¨¨●  ");

				} else if (z == 16) {
					System.out.println("         ");
					System.out.println(" ┎─────┒ ");
					System.out.println(" ┃/////┃ ");
					System.out.println(" ┃/////┃ ");
					System.out.println(" ┖─────┚ ");
					System.out.println("¨¨¨¨●  ");

				} else if (z == 17) {
					System.out.println("         ");
					System.out.println(" ┎─────┒ ");
					System.out.println(" ┃/////┃ ");
					System.out.println(" ┃/////┃ ");
					System.out.println(" ┖─────┚ ");
					System.out.println("¨¨●  ");

				} else if (z == 18) {
					System.out.println("         ");
					System.out.println(" ┎─────┒ ");
					System.out.println(" ┃/////┃ ");
					System.out.println(" ┃/////┃ ");
					System.out.println(" ┖─────┚ ");
					System.out.println("●   ");
					System.out.println(""
							+ "  ______   __    __   ______    ______   ________   ______    ______   __ \r\n"
							+ " /      \\ /  |  /  | /      \\  /      \\ /        | /      \\  /      \\ /  |\r\n"
							+ "/$$$$$$  |$$ |  $$ |/$$$$$$  |/$$$$$$  |$$$$$$$$/ /$$$$$$  |/$$$$$$  |$$ |\r\n"
							+ "$$ \\__$$/ $$ |  $$ |$$ |  $$/ $$ |  $$/ $$ |__    $$ \\__$$/ $$ \\__$$/ $$ |\r\n"
							+ "$$      \\ $$ |  $$ |$$ |      $$ |      $$    |   $$      \\ $$      \\ $$ |\r\n"
							+ " $$$$$$  |$$ |  $$ |$$ |   __ $$ |   __ $$$$$/     $$$$$$  | $$$$$$  |$$/ \r\n"
							+ "/  \\__$$ |$$ \\__$$ |$$ \\__/  |$$ \\__/  |$$ |_____ /  \\__$$ |/  \\__$$ | __ \r\n"
							+ "$$    $$/ $$    $$/ $$    $$/ $$    $$/ $$       |$$    $$/ $$    $$/ /  |\r\n"
							+ " $$$$$$/   $$$$$$/   $$$$$$/   $$$$$$/  $$$$$$$$/  $$$$$$/   $$$$$$/  $$/ \r\n"
							+ "                                                                          \n\n\n\n");
					break;

				}

			} else {
				System.out.println("" + "▓█████▄ ▓█████ ▄▄▄     ▄▄▄█████▓ ██░ ██ \r\n"
						+ "▒██▀ ██▌▓█   ▀▒████▄   ▓  ██▒ ▓▒▓██░ ██▒\r\n"
						+ "░██   █▌▒███  ▒██  ▀█▄ ▒ ▓██░ ▒░▒██▀▀██░\r\n"
						+ "░▓█▄   ▌▒▓█  ▄░██▄▄▄▄██░ ▓██▓ ░ ░▓█ ░██ \r\n"
						+ "░▒████▓ ░▒████▒▓█   ▓██▒ ▒██▒ ░ ░▓█▒░██▓\r\n"
						+ " ▒▒▓  ▒ ░░ ▒░ ░▒▒   ▓▒█░ ▒ ░░    ▒ ░░▒░▒\r\n"
						+ " ░ ▒  ▒  ░ ░  ░ ▒   ▒▒ ░   ░     ▒ ░▒░ ░\r\n"
						+ " ░ ░  ░    ░    ░   ▒    ░       ░  ░░ ░\r\n"
						+ "   ░       ░  ░     ░  ░         ░  ░  ░\r\n" + " ░                                      ");
				System.exit(0);
			}

			z++;

		}
	}

	public void jing() throws InterruptedException {
		while (true) {
			int index2 = 2;
			int turn = 2;
			int life = 8;
			boolean[][] arr_bool = new boolean[3][2];
			String[][] arr_glass = new String[3][2];
			for (int i = 0; i < arr_bool.length; i++) {
				arr_bool[i][0] = new Random().nextBoolean();
				arr_bool[i][1] = !arr_bool[i][0];
				for (int j = 0; j < arr_bool[i].length; j++) {
					arr_glass[i][j] = "□";
					// System.out.print(arr_bool[i][j]);
				}
				// System.out.println();
			}
			System.out.println("\n\n\n\n");
//               Thread.sleep(1000);
			System.out.println(
					"▛▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▜");
			Thread.sleep(1000);
			System.out.println(
					"▋                                                                                                                    ▋");
			Thread.sleep(1000);
			System.out.println(
					"▋                   1.게임 시작                                2.게임 방법                                        	      ▋");
			Thread.sleep(1000);
			System.out.println(
					"▙▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▟");
			int ch = sc.nextInt();
			Thread.sleep(500);
			System.out.println("" + "\t\t\t\t   _____\r\n" + "\t\t\t\t  |__  /\r\n" + "\t\t\t\t   /_ < \r\n"
					+ "\t\t\t\t ___/ / \r\n" + "\t\t\t\t/____/  \r\n" + "\t\t\t\t        ");
			Thread.sleep(1000);
			System.out.println("" + "\t\t\t\t ___   \r\n" + "\t\t\t\t|__ \\  \r\n" + "\t\t\t\t   ) | \r\n"
					+ "\t\t\t\t  / /  \r\n" + "\t\t\t\t / /_  \r\n" + "\t\t\t\t|____| \r\n" + "\t\t\t\t       ");
			Thread.sleep(1000);
			System.out.println("" + "\t\t\t\t    \r\n" + "\t\t\t\t ___   \r\n" + "\t\t\t\t|_  |  \r\n"
					+ "\t\t\t\t  | |  \r\n" + "\t\t\t\t _| |_ \r\n" + "\t\t\t\t|_____|\r\n" + "\t\t\t\t       ");
			Thread.sleep(1000);
			System.out.println();
			System.out.println("\n❴시도 기회 : 17번❵ \n");
			System.out.println(
					"   █████████                                       █████████  █████                       █████   \r\n"
							+ "  ███░░░░░███                                     ███░░░░░███░░███                       ░░███    \r\n"
							+ " ███     ░░░  ██████  █████████████    ██████    ░███    ░░░ ███████   ██████  ████████  ███████  \r\n"
							+ "░███         ░░░░░███░░███░░███░░███  ███░░███   ░░█████████░░░███░   ░░░░░███░░███░░███░░░███░   \r\n"
							+ "░███    █████ ███████ ░███ ░███ ░███ ░███████     ░░░░░░░░███ ░███     ███████ ░███ ░░░   ░███    \r\n"
							+ "░░███  ░░███ ███░░███ ░███ ░███ ░███ ░███░░░      ███    ░███ ░███ ██████░░███ ░███       ░███ ███\r\n"
							+ " ░░█████████░░█████████████░███ █████░░██████    ░░█████████  ░░█████░░█████████████      ░░█████ \r\n"
							+ "  ░░░░░░░░░  ░░░░░░░░░░░░░ ░░░ ░░░░░  ░░░░░░      ░░░░░░░░░    ░░░░░  ░░░░░░░░░░░░░        ░░░░░  \r\n"
							+ "                                                                                                  \r\n"
							+ "                                                                                                  \r\n"
							+ "                                                                                                  ");

			if (ch == 1) {
				while (true) {
					progress(arr_glass, turn);
					System.out.println(9 - life + "번째 도전!");
					System.out.println("당신의 선택은?\n1.왼쪽 2.오른쪽");
					int ch2 = sc.nextInt();
					if (ch2 == 1 || ch2 == 2) {
						try {
							System.out.println("점프중.....");
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						if (arr_bool[index2][ch2 - 1] == true) {
							System.out.println("" + " __        ______  __     __  ________ \r\n"
									+ "/  |      /      |/  |   /  |/        |\r\n"
									+ "$$ |      $$$$$$/ $$ |   $$ |$$$$$$$$/ \r\n"
									+ "$$ |        $$ |  $$ |   $$ |$$ |__    \r\n"
									+ "$$ |        $$ |  $$  \\ /$$/ $$    |   \r\n"
									+ "$$ |        $$ |   $$  /$$/  $$$$$/    \r\n"
									+ "$$ |_____  _$$ |_   $$ $$/   $$ |_____ \r\n"
									+ "$$       |/ $$   |   $$$/    $$       |\r\n"
									+ "$$$$$$$$/ $$$$$$/     $/     $$$$$$$$/ \r\n"
									+ "                                       ");
							index2--;
							turn--;
						} else {
							System.out.println("" + "▓█████▄ ▓█████ ▄▄▄     ▄▄▄█████▓ ██░ ██ \r\n"
									+ "▒██▀ ██▌▓█   ▀▒████▄   ▓  ██▒ ▓▒▓██░ ██▒\r\n"
									+ "░██   █▌▒███  ▒██  ▀█▄ ▒ ▓██░ ▒░▒██▀▀██░\r\n"
									+ "░▓█▄   ▌▒▓█  ▄░██▄▄▄▄██░ ▓██▓ ░ ░▓█ ░██ \r\n"
									+ "░▒████▓ ░▒████▒▓█   ▓██▒ ▒██▒ ░ ░▓█▒░██▓\r\n"
									+ " ▒▒▓  ▒ ░░ ▒░ ░▒▒   ▓▒█░ ▒ ░░    ▒ ░░▒░▒\r\n"
									+ " ░ ▒  ▒  ░ ░  ░ ▒   ▒▒ ░   ░     ▒ ░▒░ ░\r\n"
									+ " ░ ░  ░    ░    ░   ▒    ░       ░  ░░ ░\r\n"
									+ "   ░       ░  ░     ░  ░         ░  ░  ░\r\n"
									+ " ░                                      ");

							arr_glass[index2][ch2 - 1] = " ";
							index2 = 2;
							turn = 2;
							life--;
						}

					} else
						System.out.println("올바른 숫자를 입력해주세요");
					if (life == 0) {
						System.out.println(
								".                              |\r\n" + "  　╲　　　　　　　　　　　╱\r\n" + "  　　　　　　　　　　/\r\n"
										+ "  　　　╲　　　　　　　　╱\r\n" + "  　　╲　　    　　　　　╱\r\n" + "  -　-　　Game over　-　-\r\n"
										+ "  　　╱　   　　　　　　╲\r\n" + "  　╱　　/                              .\r\n"
										+ "  　　╱　　　　　　　　╲\r\n" + "  　　　　　/　|　　　\r\n" + "  　　　　　　　.\r\n" + "");
						break;
					}
					if (turn == -1) {
						System.out.println("\n\n\n\n");
						Thread.sleep(3000);
						m.fx(14);
						System.out.println(
								"\t\t\t\t██╗   ██╗ ██████╗ ██╗   ██╗    ██╗    ██╗██╗███╗   ██╗    ██╗██╗██╗██╗██╗██╗\r\n"
										+ "\t\t\t\t╚██╗ ██╔╝██╔═══██╗██║   ██║    ██║    ██║██║████╗  ██║    ██║██║██║██║██║██║\r\n"
										+ "\t\t\t\t ╚████╔╝ ██║   ██║██║   ██║    ██║ █╗ ██║██║██╔██╗ ██║    ██║██║██║██║██║██║\r\n"
										+ "\t\t\t\t  ╚██╔╝  ██║   ██║██║   ██║    ██║███╗██║██║██║╚██╗██║    ╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝\r\n"
										+ "\t\t\t\t   ██║   ╚██████╔╝╚██████╔╝    ╚███╔███╔╝██║██║ ╚████║    ██╗██╗██╗██╗██╗██╗\r\n"
										+ "\t\t\t\t   ╚═╝    ╚═════╝  ╚═════╝      ╚══╝╚══╝ ╚═╝╚═╝  ╚═══╝    ╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝\r\n"
										+ "\t\t\t\t                                                                           ");
						System.out.println("\n\n\n\n");
						Thread.sleep(2000);
						System.out.println("\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⢹⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⣶⣶⣶⣶⣶⣶⣶⣶⣶⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣶⣦⣶⣶⣶⣶⣶⣤⣶\r\n"
								+ "\t\t\t\t⣿⡅⠀⣀⣀⣀⣀⣀⣁⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣇⣀⣄⣨⣁⣄⡄⠀⢸⡿\r\n"
								+ "\t\t\t\t⣿⡇⠀⢿⡟⠛⠛⠛⠛⢻⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡟⠛⠛⠛⠛⣿⡇⠀⣾⡟\r\n"
								+ "\t\t\t\t⢹⣧⠀⢸⣧⠀⠀⠀⠀⠸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⠁⠀⠀⠀⠀⣿⠇⠀⣿⠇\r\n"
								+ "\t\t\t\t⠈⣿⡆⠀⣿⡄⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⢸⣿⠀⢸⡿⠨\r\n"
								+ "\t\t\t\t⠀⢹⣷⠀⢻⣧⠀⠀⠀⠀⢻⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠇⠀⠀⠀⢀⣾⠇⢠⣿⠃⠀\r\n"
								+ "\t\t\t\t⠀⠀⢻⣧⠈⢿⣦⠀⠀⠀⠸⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⣼⡟⠀⣾⡏⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠈⢿⣇⠈⣿⣆⠀⠀⠀⢹⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⢀⣼⡟⢀⣾⠏⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⢻⣧⡛⢻⣧⡀⠀⠈⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⡟⠀⠀⢀⣾⠟⢠⣾⠟⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠹⣿⣤⠹⣿⣆⠀⠹⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⠁⢀⣴⡿⠃⣰⡿⠋⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠀⠈⢿⣦⡈⠻⣷⣄⢻⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⢃⣴⡿⠋⣠⣾⡟⠁⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣦⡈⠛⢿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⠿⠋⣠⣾⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠻⣷⣄⡈⢻⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⠟⢁⣤⡾⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⢿⣶⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣯⣶⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠻⢿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⡿⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡾⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⢿⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣶⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠻⠿⣶⣦⣄⣀⣀⠀⢀⣀⣀⣤⣴⣶⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢹⣿⠀⠈⣿⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣴⣶⣶⣶⣾⣿⣶⣶⣿⣶⣶⣶⣶⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣤⣠⣿⣅⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣄⣹⣿⣤⣤⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⡾⠟⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠙⠻⣷⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣶⣶⣶⣿⣷⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣾⣿⣶⣶⣶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⠀⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣧⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣼⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢈⣈⣉⣉⣉⣉⣉⢉⢉⡉⡉⣉⢉⢉⢉⡉⡉⣉⢉⢉⢉⡉⡉⣉⢉⠉⡉⠉⠉⢉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
						System.out.println("\n\n\n\n");
						Thread.sleep(3000);
						System.out.println(
								"██╗  ██╗███████╗    ██████╗  ██████╗  ██████╗     ██████╗  ██████╗  ██████╗     ██████╗  ██████╗  ██████╗ ██╗    ██╗ ██████╗ ███╗   ██╗\r\n"
										+ "██║  ██║██╔════╝   ██╔═████╗██╔═████╗██╔═████╗   ██╔═████╗██╔═████╗██╔═████╗   ██╔═████╗██╔═████╗██╔═████╗██║    ██║██╔═══██╗████╗  ██║\r\n"
										+ "███████║███████╗   ██║██╔██║██║██╔██║██║██╔██║   ██║██╔██║██║██╔██║██║██╔██║   ██║██╔██║██║██╔██║██║██╔██║██║ █╗ ██║██║   ██║██╔██╗ ██║\r\n"
										+ "╚════██║╚════██║   ████╔╝██║████╔╝██║████╔╝██║   ████╔╝██║████╔╝██║████╔╝██║   ████╔╝██║████╔╝██║████╔╝██║██║███╗██║██║   ██║██║╚██╗██║\r\n"
										+ "     ██║███████║▄█╗╚██████╔╝╚██████╔╝╚██████╔╝▄█╗╚██████╔╝╚██████╔╝╚██████╔╝▄█╗╚██████╔╝╚██████╔╝╚██████╔╝╚███╔███╔╝╚██████╔╝██║ ╚████║\r\n"
										+ "     ╚═╝╚══════╝╚═╝ ╚═════╝  ╚═════╝  ╚═════╝ ╚═╝ ╚═════╝  ╚═════╝  ╚═════╝ ╚═╝ ╚═════╝  ╚═════╝  ╚═════╝  ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═══╝\r\n"
										+ "                                                                                                                                       ");
						System.exit(0);
					}
				}
			} else if (ch == 2)
				System.out.println("오징어게임 보고 오세요");
			else {
				System.out.println("올바른 숫자를 입력해주세요");
			}
		}

	}

	public static void progress(String[][] arr_glass2, int turn2) {
		for (int i = 0; i < arr_glass2.length; i++) {
			System.out.print("││");
			for (int j = 0; j < arr_glass2[i].length; j++) {
				System.out.print("   " + arr_glass2[i][j] + "   ");
			}
			System.out.print("││");
			if (i == turn2 + 1)
				System.out.println("<-------현위치");
			else
				System.out.println();
		}
	}

}
