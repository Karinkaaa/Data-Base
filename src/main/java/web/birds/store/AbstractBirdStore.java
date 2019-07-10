package main.java.web.birds.store;

import main.java.web.birds.entities.Bird;

import java.util.List;

public abstract class AbstractBirdStore {
    /**
     * Добавить новый объект
     *
     * @param bird объект который должен быть добьавлен.
     *          <p>
     *          Если объект с тактм именем уже существует - вывести Bird With name .... already exists.
     */
    public abstract void addBird(Bird bird);
    public abstract void deleteBird(String name);

    /**
     * Вернуть объект у которого name = nameToSearch
     *
     * @param nameToSearch имя по которому нужно найти объект.
     * @return обьект Bird или null если не существует объекта с таким nameToSearch
     */
    public abstract Bird searchByName(String nameToSearch);

    /**
     * Вернуть все объекты у которых livingArea = livingAreaToFind
     *
     * @param livingAreaToFind areaLiving по которому нужно найти все объекты.
     * @return все объекты у которых livingArea = livingAreaToFind
     */
    public abstract List searchByLivingArea(String livingAreaToFind);
}
