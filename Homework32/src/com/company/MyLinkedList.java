package com.company;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class MyLinkedList<T> implements Iterable<T>  {
    private T element;
    private MyLinkedList next = null;
    private int pos = 0;
    private MyIter myIter = new MyIter();
    private void setPos(int pos){
        this.pos = pos;
    }

    public void add(T e) {
        if (element == null){
            element = e;
            return;
        } else {
            if(next == null){
                next = new MyLinkedList<>();
                next.setPos(pos+1);
                next.element = e;
            } else {
                next.add(e);
            }
        }
    }

    private void updatePos(){
        if(next != null){
            next.setPos(pos+1);
        }
    }

    public T get(int index) {
        if(index == pos) {
            return this.element;
        } else {
            if(next != null){
                return (T) next.get(index);
            }else{
                return null;
            }
        }
    }

    private T get(){
        return element;
    }

    //число элементов в списке
    public int size() {
        if(next != null){
            return next.size();
        }else{
            return pos+1;
        }
    }


    //есть ли в списке такой элемент
    public boolean contains(T element) {
        if(this.element != element){
            if(next != null){
                return next.contains(element);
            }else{
                return false;
            }
        } else{
            return true;
        }
    }

    public MyLinkedList getNext() {
        return next;
    }

    //удаление элемента по индекс (со смещением элементов влево)
    public void remove(int index) {
        if(this.pos != pos){
            if(next != null){
                next.remove(index);
            }
        } else{
            next = next.getNext();
        }
    }


    //добавление всех элементов из списка list в данный список(в конец)
    public void addAll(MyLinkedList list) {
        if(next!= null){
            next.addAll(list);
        }else{
            next = list;
        }
        updatePos();
    }


    //добавление всех элементов из списка list в данный список
    //начиная с позиции index
    public void addAll(MyLinkedList list, int index) {
        if(pos != index){
            if(next != null){
                next.addAll(list,index);
            }else{
                next.addAll(list);
            }
        }else {
            list.addAll(next);
            next = list;
        }
        updatePos();
    }

    @Override
    public Iterator<T> iterator() {
        return myIter;
    }

    class MyIter implements Iterator<T> {
        boolean check = false;
        MyLinkedList i;
        @Override
        public boolean hasNext() {
            if (!check){
                return true;
            }else {
                return  i != null;
            }
        }

        @Override
        public T next() {
            if(!check){
                check=true;
                i=next;
                return element;
            } else{
                T returnable = (T) i.get();
                i = i.next;
                return returnable;
            }
        }
    }

    public Stream<T> stream() {
        return new MyLinkedList.MyStream(this);
    }


    class MyStream implements Stream<T>{
        MyLinkedList list;
        MyStream(MyLinkedList list){
            this.list = list;
        }


        @Override
        public Stream<T> filter(Predicate<? super T> predicate) {
            MyLinkedList<T> newList = new MyLinkedList<>();
            for (Object e: list) {
                if(predicate.test((T) e)){
                    newList.add((T) e);
                }
            }
            return (Stream<T>) newList.new MyStream(newList);
        }

        @Override
        public <R> Stream<R> map(Function<? super T, ? extends R> function) {
            MyLinkedList<T> newList = new MyLinkedList<>();
            for (Object e: list) {
                newList.add((T) function.apply((T) e));
            }
            return (Stream<R>) newList.new MyStream(newList);
        }

        @Override
        public IntStream mapToInt(ToIntFunction<? super T> toIntFunction) {
            return null;
        }

        @Override
        public LongStream mapToLong(ToLongFunction<? super T> toLongFunction) {
            return null;
        }

        @Override
        public DoubleStream mapToDouble(ToDoubleFunction<? super T> toDoubleFunction) {
            return null;
        }

        @Override
        public <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> function) {
            return null;
        }

        @Override
        public IntStream flatMapToInt(Function<? super T, ? extends IntStream> function) {
            return null;
        }

        @Override
        public LongStream flatMapToLong(Function<? super T, ? extends LongStream> function) {
            return null;
        }

        @Override
        public DoubleStream flatMapToDouble(Function<? super T, ? extends DoubleStream> function) {
            return null;
        }

        @Override
        public Stream<T> distinct() {
            return null;
        }

        @Override
        public Stream<T> sorted() {
            return null;
        }

        @Override
        public Stream<T> sorted(Comparator<? super T> comparator) {
            return null;
        }

        @Override
        public Stream<T> peek(Consumer<? super T> consumer) {
            return null;
        }

        @Override
        public Stream<T> limit(long l) {
            return null;
        }

        @Override
        public Stream<T> skip(long l) {
            return null;
        }

        @Override
        public void forEach(Consumer<? super T> consumer) {
            for(Object e: list){
                consumer.accept((T) e);
            }
        }

        @Override
        public void forEachOrdered(Consumer<? super T> consumer) {

        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <A> A[] toArray(IntFunction<A[]> intFunction) {
            return null;
        }

        @Override
        public T reduce(T t, BinaryOperator<T> binaryOperator) {
            return null;
        }

        @Override
        public Optional<T> reduce(BinaryOperator<T> binaryOperator) {
            return Optional.empty();
        }

        @Override
        public <U> U reduce(U u, BiFunction<U, ? super T, U> biFunction, BinaryOperator<U> binaryOperator) {
            return null;
        }

        @Override
        public <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> biConsumer, BiConsumer<R, R> biConsumer1) {
            return null;
        }

        @Override
        public <R, A> R collect(Collector<? super T, A, R> collector) {
            return null;
        }

        @Override
        public Optional<T> min(Comparator<? super T> comparator) {
            return Optional.empty();
        }

        @Override
        public Optional<T> max(Comparator<? super T> comparator) {
            return Optional.empty();
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public boolean anyMatch(Predicate<? super T> predicate) {
            return false;
        }

        @Override
        public boolean allMatch(Predicate<? super T> predicate) {
            return false;
        }

        @Override
        public boolean noneMatch(Predicate<? super T> predicate) {
            return false;
        }

        @Override
        public Optional<T> findFirst() {
            return Optional.empty();
        }

        @Override
        public Optional<T> findAny() {
            return Optional.empty();
        }

        @Override
        public Iterator<T> iterator() {
            return null;
        }

        @Override
        public Spliterator<T> spliterator() {
            return null;
        }

        @Override
        public boolean isParallel() {
            return false;
        }

        @Override
        public Stream<T> sequential() {
            return null;
        }

        @Override
        public Stream<T> parallel() {
            return null;
        }

        @Override
        public Stream<T> unordered() {
            return null;
        }

        @Override
        public Stream<T> onClose(Runnable runnable) {
            return null;
        }

        @Override
        public void close() {

        }
    }

}