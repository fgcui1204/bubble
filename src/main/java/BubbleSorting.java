class BubbleSorting {

    int[] bubble(int[] data) {

        for (int j = 0; j < data.length - 1; j++) {
            boolean NoChangedSorting = true;
            for (int i = 0; i < data.length - 1 -j; i++) {
                if (data[i] > data[i + 1]) {
                    int temp = data[i + 1];
                    data[i + 1] = data[i];
                    data[i] = temp;
                    NoChangedSorting = false;
                }

            }
            if (NoChangedSorting) {
                break;
            }
        }
        
        return data;
    }
}
