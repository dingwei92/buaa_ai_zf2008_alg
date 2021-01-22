package com.example.alg.controller;

import com.example.alg.dto.AlgRepDTO;
import com.example.alg.dto.AlgReqDTO;
import com.example.alg.service.impl.AAlgServiceImpl;


import com.example.alg.service.impl.EightPuzzle;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * @Auther: dingwei
 * @Date: 2021/1/15 16:20
 * @Description:
 */
@RestController
@RequestMapping("/api/alg")
public class AlgController {


    @RequestMapping("/solve")
    @ResponseBody
    public AlgRepDTO getUniversityById(@RequestBody AlgReqDTO algReqDTO) {

        switch (algReqDTO.getAlg()) {
            case "1":
                int[][] array = new int[3][3];
                array[0][0] = algReqDTO.getList1().get(0);
                array[0][1] = algReqDTO.getList1().get(1);
                array[0][2] = algReqDTO.getList1().get(2);
                array[1][0] = algReqDTO.getList1().get(3);
                array[1][1] = algReqDTO.getList1().get(4);
                array[1][2] = algReqDTO.getList1().get(5);
                array[2][0] = algReqDTO.getList1().get(6);
                array[2][1] = algReqDTO.getList1().get(7);
                array[2][2] = algReqDTO.getList1().get(8);
                AAlgServiceImpl aAlgService = new AAlgServiceImpl(array);
                boolean flag = aAlgService.solve();
                if (!flag) {
                    return new AlgRepDTO(false);
                }
                AlgRepDTO<String> algRepDTO = new AlgRepDTO<>();
                algRepDTO.setList(tolist(algReqDTO.getList1(), aAlgService.printRoute()));
                algRepDTO.setFlag(true);
                return algRepDTO;
            case "2":
                EightPuzzle eightPuzzle = new EightPuzzle();
                int[] array1 = algReqDTO.getList1().stream().mapToInt(Integer::valueOf).toArray();
                int[] array2;
                if (algReqDTO.getList3() == null) {
                    array2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 0};
                } else {
                    array2 = algReqDTO.getList3().stream().mapToInt(Integer::valueOf).toArray();
                }
                return eightPuzzle.solve(array1, array2);
            default:
                return null;
        }
    }


    private List tolist(List<Integer> startList, List<String> proc) {
        List list = new ArrayList();
        list.add(new ArrayList<>(startList).clone());
        List<Integer> listTemple = startList;
        for (String ss : proc) {
            List result = new ArrayList();
            Integer index = listTemple.indexOf(0);
            Integer i;
            Integer j;
            Integer temple;
            switch (ss) {
                case "左":
                    i = listTemple.get(index - 1);
                    j = listTemple.get(index);
                    temple = i;
                    listTemple.set(index - 1, j);
                    listTemple.set(index, temple);
                    result = listTemple;
                    list.add(new ArrayList<>(listTemple).clone());
                    break;
                case "右":
                    i = listTemple.get(index + 1);
                    j = listTemple.get(index);
                    temple = i;
                    listTemple.set(index + 1, j);
                    listTemple.set(index, temple);
                    list.add(new ArrayList<>(listTemple).clone());
                    break;
                case "上":
                    i = listTemple.get(index - 3);
                    j = listTemple.get(index);
                    temple = i;
                    listTemple.set(index - 3, j);
                    listTemple.set(index, temple);
                    list.add(new ArrayList<>(listTemple).clone());
                    break;
                case "下":
                    i = listTemple.get(index + 3);
                    j = listTemple.get(index);
                    temple = i;
                    listTemple.set(index + 3, j);
                    listTemple.set(index, temple);
                    list.add(new ArrayList<>(listTemple).clone());
                    break;
                default:
                    break;
            }

        }
        return list;
    }
}
