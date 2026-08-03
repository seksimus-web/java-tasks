package com.seksimus.basicjava.module5.task5;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Task5Runner {

    public static void main(String[] args) {
        Animal[] originalAnimals = {
                new Animal("Кот"),
                new Animal("Собака"),
                new Animal("Корова")
        };

        byte[] data = serializeAnimalArray(originalAnimals);

        Animal[] restoredAnimals = deserializeAnimalArray(data);

        System.out.println(Arrays.toString(restoredAnimals));
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (
                ObjectInputStream objectInputStream =
                        new ObjectInputStream(new ByteArrayInputStream(data))
        ) {
            int size = objectInputStream.readInt();

            Animal[] animals = new Animal[size];

            for (int i = 0; i < size; i++) {
                animals[i] = (Animal) objectInputStream.readObject();
            }

            return animals;

        } catch (
                IOException |
                ClassNotFoundException |
                ClassCastException |
                NegativeArraySizeException |
                NullPointerException e
        ) {
            throw new IllegalArgumentException(e);
        }
    }

    private static byte[] serializeAnimalArray(Animal[] animals) {
        try (
                ByteArrayOutputStream byteOutputStream =
                        new ByteArrayOutputStream();

                ObjectOutputStream objectOutputStream =
                        new ObjectOutputStream(byteOutputStream)
        ) {
            objectOutputStream.writeInt(animals.length);

            for (Animal animal : animals) {
                objectOutputStream.writeObject(animal);
            }

            objectOutputStream.flush();

            return byteOutputStream.toByteArray();

        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}