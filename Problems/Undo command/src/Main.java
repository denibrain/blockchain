interface Movable {
    int getX();
    int getY();
    void setX(int newX);
    void setY(int newY);
}

interface Storable {
    int getInventoryLength();
    String getInventoryItem(int index);
    void setInventoryItem(int index, String item);
}

interface Command {
    void execute();
    void undo();
}

class CommandMove implements Command {
    Movable entity;
    int xMovement;
    int yMovement;

    @Override
    public void execute() {
        entity.setX(entity.getX() + xMovement);
        entity.setY(entity.getY() + yMovement);
    }

    @Override
    public void undo() {
        entity.setX(entity.getX() - xMovement);
        entity.setY(entity.getY() - yMovement);
    }
}

class CommandPutItem implements Command {
    Storable entity;
    String item;
    int lastPosition = -1;

    @Override
    public void execute() {
        int l = entity.getInventoryLength();
        if (l==0) {
            return;
        }
        if (lastPosition >= 0) {
            lastPosition++;
            if (lastPosition < l) {
                entity.setInventoryItem(lastPosition, item);
            }
        }
        else {
            for (int i = 0; i < l; i++) {
                if (entity.getInventoryItem(i) == null) {
                    lastPosition = i;
                    entity.setInventoryItem(i, item);
                    return;
                }
            }
            lastPosition = l;
        }
    }

    @Override
    public void undo() {
        if (lastPosition == -1) {
            return;
        }
        if (lastPosition < entity.getInventoryLength()) {
            entity.setInventoryItem(lastPosition, null);
        }
        lastPosition--;
    }
}