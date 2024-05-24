import java.util.Scanner;

public class Help {
    public static void main(String[] args) {
        // 사용자 입력을 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력을 저장할 변수
        String userInput;

        // 프로그램이 계속 실행 중인지를 나타내는 변수
        boolean isProgramRunning = true;

        // 사용자가 프로그램을 종료할 때까지 반복하여 도움말을 표시함
        while (isProgramRunning) {
            // 사용자에게 도움말 메뉴를 출력하여 선택지를 보여줌ㅜ

            System.out.println("원하는 주제에 대한 도움말을 선택을하세요:");

            

            System.out.println("1. if 문");
            System.out.println("2. switch 문");
            System.out.println("3. for 문");
            System.out.println("4. while 문");
            System.out.println("5. do-while 문");
            System.out.println("q. 프로그램 종료");

            // 사용자의 입력을 받음
            System.out.print("선택하세요: ");
            userInput = scanner.nextLine();

            // 사용자의 선택에 따라 도움말을 표시함
            switch (userInput) {
                case "1":
                    System.out.println("if 문은 주어진 조건이 참일 때 특정 코드 블록을 실행하는 데 사용됩니다.\n");
                    break;
                case "2":
                    System.out.println("switch 문은 여러 가지 경우에 따라 다른 동작을 수행하는 데 사용됩니다.\n");
                    break;
                case "3":
                    System.out.println("for 문은 특정 조건에 따라 일정한 횟수만큼 코드 블록을 반복하는 데 사용됩니다.\n");
                    break;
                case "4":
                    System.out.println("while 문은 주어진 조건이 참일 때 코드 블록을 반복하여 실행하는 데 사용됩니다.\n");
                    break;
                case "5":
                    System.out.println("do-while 문은 일정한 조건이 참일 때 코드 블록을 반복하여 실행하는 데 사용됩니다.\n");
                    break;
                case "q":
                case "Q":
                    System.out.println("프로그램을 종료합니다.");
                    isProgramRunning = false; // 반복문 종료
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 1에서 5 사이의 번호 또는 'q'를 입력하세요.");
            }
        }

        // Scanner 객체를 닫음
        scanner.close();
    }
}
