public abstract class AbtractTree<E> implements Tree<E> {

    @Override
    public boolean insert(E e) {
        return false;
    }

    @Override
    public void inoeder() {

    }

    public abstract void inorder();
}
