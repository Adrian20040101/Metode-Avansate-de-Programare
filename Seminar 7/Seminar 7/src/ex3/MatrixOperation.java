package ex3;

import ex2.SumThread;

import java.util.ArrayList;
import java.util.List;

public class MatrixOperation {
    public ArrayList<ArrayList<Integer>> matrix1;
    public ArrayList<ArrayList<Integer>> matrix2;

    public void sumMatrix(int threadNumber) throws InterruptedException {
        List<Thread> threadList = new ArrayList<>();

        int blockSize = 1;
        int start = 0;
        for (int i = 0; i < threadNumber - 1; i++){
            threadList.add(new SumThread(matrix1, matrix2, start, start + blockSize));
            start++;
        }
        threadList.add(new SumThread(matrix1, matrix2, start, matrix1.size() - 1));

        ArrayList<ArrayList<Integer>> returnStatement = new ArrayList<>();
        for (int i = 0; i < threadNumber; i++){
            threadList.get(i).start();
        }

        for (int i = 0; i < threadNumber; i++){
            threadList.get(i).join();
        }

        for (int i = 0; i < threadNumber; i++){
            SumThread temp = (SumThread) threadList.get(i);
            System.out.println(temp.resultMatrix);
        }
    }

    public class SumThread extends Thread{
        public ArrayList<ArrayList<Integer>> resultMatrix;
        public ArrayList<ArrayList<Integer>> m1;
        public ArrayList<ArrayList<Integer>> m6;
        public int startRow;
        public int endRow;

        public SumThread(ArrayList<ArrayList<Integer>> m1, ArrayList<ArrayList<Integer>> m2, int startRow, int endRow){
            this.m1 = m1;
            this.m6 = m2;
            this.resultMatrix = new ArrayList<ArrayList<Integer>>();
            this.startRow = startRow;
            this.endRow = endRow;

            for (int i = 0; i < m1.size(); i++){
                ArrayList<Integer> temp = new ArrayList<>();
                for (int j = 0; j < m1.get(i).size(); j++){
                    temp.add(0);
                }
                resultMatrix.add(temp);
            }
        }

        @Override
        public void run(){
            for (int i = startRow; i < endRow; i++){
                ArrayList<Integer> temp = m1.get(i);
                for (int j = 0; j < this.m6.get(0).size(); j++){
                    temp.set(j, m1.get(i).get(j) + m6.get(i).get(j))
                }
            }
        }
    }
}
