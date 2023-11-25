public class TimeNeededToBuyTickets {

    public static void main(String[] args) {
        int time = 0;

        int[] tickets = { 5, 1, 1, 1 };

        int k = 0;

        while (tickets[k] != 0) {

            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] == 0)
                    continue;
                tickets[i] -= 1;
                time++;

            }
        }

        System.out.println(time);

        for (int i : tickets) {
            System.out.print(i + " ");
        }

    }

}
