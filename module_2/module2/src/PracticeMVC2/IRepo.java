package PracticeMVC2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IRepo implements InterRe{
    List<Model> modelList = new ArrayList<>();
    @Override
    public void display() {
        modelList = ReWi.readMo();
        for (Model model : modelList){
            System.out.println(model);
        }
    }

    @Override
    public void add(Model model) {
        modelList.clear();
        modelList.add(model);
        ReWi.writeMoAp(modelList);
    }

    @Override
    public void search(String string) {
        modelList = ReWi.readMo();
        for (Model model : modelList){
            if (model.getName().equals(string)){
                System.out.println(model);
            }
        }
    }

    @Override
    public void delete(String string) {
        modelList = ReWi.readMo();
        for (Model model : modelList){
            if (model.getId().equals(string)){
                modelList.remove(model);
            }
        }
        ReWi.writeMo(modelList);
    }

    @Override
    public void sort() {
        modelList = ReWi.readMo();
        Collections.sort(modelList, new Comparator<Model>() {
            @Override
            public int compare(Model o1, Model o2) {
                return Integer.parseInt(o1.getId()) - Integer.parseInt(o2.getId());
            }
        });
        ReWi.writeMo(modelList);
    }

    @Override
    public Model findId(String id) {
        modelList = ReWi.readMo();
        for (Model model : modelList){
            if (model.getId().equals(id)){
                return model;
            }
        }
        return null;
    }

    @Override
    public void update(Model model) {
      modelList = ReWi.readMo();
        for (int i = 0; i < modelList.size() ; i++) {
            if (modelList.get(i).getId().equals(model.getId())){
                modelList.set(i,model);
                break;
            }
        }
        ReWi.writeMo(modelList);
    }
}
